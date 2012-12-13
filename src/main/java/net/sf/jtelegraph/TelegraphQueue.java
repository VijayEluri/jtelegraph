/**
 * JTelegraph -- a Java message notification library
 * Copyright (c) 2012, Paulo Roberto Massa Cereda
 * All rights reserved.
 *
 * Redistribution and  use in source  and binary forms, with  or without
 * modification, are  permitted provided  that the  following conditions
 * are met:
 *
 * 1. Redistributions  of source  code must  retain the  above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form  must reproduce the above copyright
 * notice, this list  of conditions and the following  disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * 3. Neither  the name  of the  project's author nor  the names  of its
 * contributors may be used to  endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS  PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS
 * "AS IS"  AND ANY  EXPRESS OR IMPLIED  WARRANTIES, INCLUDING,  BUT NOT
 * LIMITED  TO, THE  IMPLIED WARRANTIES  OF MERCHANTABILITY  AND FITNESS
 * FOR  A PARTICULAR  PURPOSE  ARE  DISCLAIMED. IN  NO  EVENT SHALL  THE
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE  LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY,  OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT  NOT LIMITED  TO, PROCUREMENT  OF SUBSTITUTE  GOODS OR  SERVICES;
 * LOSS  OF USE,  DATA, OR  PROFITS; OR  BUSINESS INTERRUPTION)  HOWEVER
 * CAUSED AND  ON ANY THEORY  OF LIABILITY, WHETHER IN  CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 * WAY  OUT  OF  THE USE  OF  THIS  SOFTWARE,  EVEN  IF ADVISED  OF  THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 * TelegraphQueue.java: This class implements a telegraph queue.
 */

// package definition
package net.sf.jtelegraph;

// needed imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.Timer;

/**
 * Implements a telegraph queue.
 * @author Paulo Roberto Massa Cereda
 * @version 2.0
 * @since 2.0
 */
public class TelegraphQueue implements ActionListener {

    // a queue, a timer and a notification
    private Queue<Telegraph> queue;
    private Timer timer;
    private Telegraph current;

    /**
    * Constructor.
    */
    public TelegraphQueue() {
        
        // set everything
        queue = new LinkedList<Telegraph>();
        timer = new Timer(50, this);
        current = null;
    }

    /**
     * Adds the telegraph to the queue.
     * @param telegraph The telegraph.
     */
    public synchronized void add(Telegraph telegraph) {
        
        // check if queue is empty and there is no
        // current notification
        if (queue.isEmpty() && (current == null)) {

            // show notification
            current = telegraph;
            current.show();
        }
        else {
            
            // there are other notifications, so we need to wait
            queue.offer(telegraph);

            // check if timer is not running
            if (timer.isRunning() == false) {

                // start the timer
                timer.start();
            }
        }
    }

    /**
     * Implements the listener for the queue.
     * @param e The event.
     */
    public void actionPerformed(ActionEvent e) {

        // there is a current notification going on
        if (current != null) {

            // check if queue is not empty and there is no
            // notification running
            if ((!queue.isEmpty()) && (!current.isRunning())) {

                // poll a notification from the queue
                current = queue.poll();

                // animate
                current.show();
            }
            else {

                // if the queue is empty
                if (queue.isEmpty()) {

                    // stop the timer
                    timer.stop();
                }
            }
        }
    }
}