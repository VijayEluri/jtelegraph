/*
 *   JTelegraph -- a Java message notification library
 *   Copyright (c) 2012, Paulo Roberto Massa Cereda
 *   All rights reserved.
 *
 *   Redistribution and use in source and binary forms, with or without
 *   modification, are permitted provided that the following conditions
 *   are met:
 *
 *   1. Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 *   2. Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 *   3. Neither the name of the project's author nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 *   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *   "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 *   LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 *   FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 *   COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *   INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 *   BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *   LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 *   CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 *   LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 *   WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *   POSSIBILITY OF SUCH DAMAGE.
 */
package org.jtelegraph.icons;

import java.text.MessageFormat;

import javax.swing.ImageIcon;

import org.jtelegraph.IconProvider;

public enum BatchIconProvider implements IconProvider {
	ADD, ADDRESS_BOOK_2, ADDRESS_BOOK, ALARM_CLOCK, ALIGN_BOTTOM_EDGES, ALIGN_HORIZONTAL_CENTERS, ALIGN_LEFT_EDGES, ALIGN_RIGHT_EDGES, ALIGN_TOP_EDGES, ALIGN_VERTICAL_CENTERS, ANCHOR, ARROW_DOWN, ARROW_LEFT, ARROW_RIGHT, ARROW_UP, ASTERISK, AT, ATTACHMENT_2, ATTACHMENT, AUDIO_HIGH, AUDIO_LOW, AUDIO_MID, AUDIO_MUTE, BATTERY_100_2, BATTERY_100, BATTERY_20_2, BATTERY_20, BATTERY_40_2, BATTERY_40, BATTERY_60_2, BATTERY_60, BATTERY_80_2, BATTERY_80, BATTERY_CHARGE_2, BATTERY_CHARGE, BATTERY_EMPTY_2, BATTERY_EMPTY, BELL_2, BELL_MUTE_2, BELL_MUTE, BELL, BIN_2, BIN_3, BIN, BOOK_2, BOOK_LINES_2, BOOK_LINES, BOOK, BRIGHTNESS_HIGH, BRIGHTNESS_LOW, BROWSER_2, BROWSER_CLOSE_2, BROWSER_CLOSE, BROWSER_DOWNLOAD_2, BROWSER_DOWNLOAD, BROWSER_MINIMISE_2, BROWSER_MINIMISE, BROWSER_NEW_WINDOW_2, BROWSER_NEW_WINDOW, BROWSER_UPLOAD_2, BROWSER_UPLOAD, BROWSER_WINDOWS_2, BROWSER_WINDOWS, BROWSER, BULB_2, BULB, BULLET, BULLHORN_2, BULLHORN, CALENDAR, CAMERA_2, CAMERA_3, CAMERA, CASETTE, CLIPBOARD_2, CLIPBOARD, CLOCK, CLOUD_ADD_2, CLOUD_ADD, CLOUD_DOWNLOAD, CLOUD_REMOVE_2, CLOUD_REMOVE, CLOUD_UPLOAD, CLOUD, CMD, CODE, COMMIT, COMPASS, COMPOSE_2, COMPOSE_3, COMPOSE_4, COMPOSE, CONTRACT_2, CONTRACT_3, CONTRACT, CONTRAST, CONVERGE, CRATE, CREDIT_CARD_2, CREDIT_CARD_3, CREDIT_CARD_4, CREDIT_CARD, CROP, CROSS, CURLYBRACE_2, CURLYBRACE, DATABASE_ADD, DATABASE_REMOVE, DATABASE, DELETE, DISTRIBUTE_BOTTOM_EDGES, DISTRIBUTE_HORIZONTAL_CENTERS, DISTRIBUTE_LEFT_EDGES, DISTRIBUTE_RIGHT_EDGES, DISTRIBUTE_TOP_EDGES, DISTRIBUTE_VERTICAL_CENTERS, DOCUMENT_ADD, DOCUMENT_REMOVE, DOCUMENT, DROPLET, ELLIPSIS, ENVELOPE, EXCLUDE, EXPAND_2, EXPAND_3, EXPAND, EYE_2, EYE, FAST_FORWARD, FLAG_2, FLAG, FLASK_EMPTY, FLASK_FULL, FLOPPY, FLUX, FOLDER_2, FOLDER_ADD_2, FOLDER_ADD, FOLDER_DUPLICATE_2, FOLDER_DUPLICATE, FOLDER_REMOVE_2, FOLDER_REMOVE, FOLDER, FORK, GRID_2, GRID, HEADPHONES, HEART_EMPTY, HEART_FULL, HEART_HALF, HOME_2, HOME_3, HOME, IMAGE, IN, INBOX_2, INBOX, INFINITY, INTERSECT, KEY_2, KEY, KEYS, LAYOUT_COLUMN_CENTER, LAYOUT_CONTENT_LEFT_2, LAYOUT_CONTENT_LEFT, LAYOUT_CONTENT_RIGHT_2, LAYOUT_CONTENT_RIGHT, LAYOUT_SIDEBAR_LEFT, LAYOUT_SIDEBAR_RIGHT, LINK_2, LINK, LIST_2, LIST, LOCKED, MAIL_2, MAIL_3, MAIL_4, MAIL_INCOMING, MAIL_OUTGOING, MAIL, MAP_2, MAP, MARQUEE_DOWNLOAD, MARQUEE_MINUS, MARQUEE_PLUS, MARQUEE_UPLOAD, MARQUEE, MAXIMISE, MENU_2, MENU_PULL_DOWN, MENU_PULL_UP, MENU, MICROPHONE_2, MICROPHONE, MINUS, MIXER, NEWSPAPER_2, NEWSPAPER, NEXT, NIB, NOPE, NOTES, OPTIONS, OUT, OUTBOX_2, OUTBOX, OUTGOING_2, OUTGOING, PAPER_RIPPED, PAPER_ROLL_RIPPED, PAPER_ROLL, PARAGRAPH_CENTER_2, PARAGRAPH_CENTER, PARAGRAPH_JUSTIFY_2, PARAGRAPH_JUSTIFY, PARAGRAPH_LEFT_2, PARAGRAPH_LEFT, PARAGRAPH_RIGHT_2, PARAGRAPH_RIGHT, PAUSE, PEN, PENCIL, PIN_2, PIN, PLAY, PLUS, PODCAST_2, PODCAST, POLAROID_2, POLAROID, POWER, PREVIOUS, PRINT, PULL, QUILL_2, QUILL, REFRESH, REMINDER, REMOVE, REPEAT_2, REPEAT, REPLY_ALL, REPLY, RETURN, REVERT, REWIND, RULERS, SAFE, SEARCH_2, SEARCH, SECTION, SETTINGS_2, SETTINGS_3, SETTINGS_4, SETTINGS, SHRED, SHUFFLE, SLEEP, SPAM_2, SPAM, SPEECH_BUBBLE_CENTER_2, SPEECH_BUBBLE_CENTER_3, SPEECH_BUBBLE_CENTER, SPEECH_BUBBLE_LEFT_2, SPEECH_BUBBLE_LEFT_3, SPEECH_BUBBLE_LEFT_4, SPEECH_BUBBLE_LEFT, SPEECH_BUBBLE_RIGHT_2, SPEECH_BUBBLE_RIGHT_3, SPEECH_BUBBLE_RIGHT_4, SPEECH_BUBBLE_RIGHT, SPINNER_2, SPINNER_3, SPINNER, SPLIT_2, SPLIT, SPOOL, SQUARE_BRACKETS, STAMP_2, STAMP, STAR_2, STAR, STIFFY, STOP, STOPWATCH, STORE_2, STORE, SUBTRACT, SUPPORT_2, SUPPORT_3, SUPPORT, SWAP_2, SWAP, SWATCH, SWATCHES, SWITCH_OFF, SWITCH_ON, TAG_2, TAG_3, TAG_4, TAG, TERMINAL_2, TERMINAL_3, TERMINAL, TICK, TILDE, TIMELINE, TOGGLE_OFF, TOGGLE_ON, TRANSFER, TRAY, UNITE, UNLOCKED, UNWATCH, USER_2_ADD, USER_2_REMOVE, USER_2, USER_3, USER_4_ADD, USER_4_REMOVE, USER_4, USER_CARD, USER, USERS, VIDEO_2, VIDEO, VINYL, VOICEMAIL, WALLET_2, WALLET, WATCH_2, WATCH, WAVE_2, WAVE, WIFI_FULL, WIFI_LOW, WIFI_MID, WIGGLE, WINDOWS, ZOOM_IN_2, ZOOM_IN, ZOOM_OUT_2, ZOOM_OUT

	;

	String ICON_PATH = "/batch/{0}.png";

	@Override
	public ImageIcon getIcon() {
		return new ImageIcon(getClass().getResource(
				MessageFormat.format(ICON_PATH, toString().toLowerCase()
						.replace("_", "-"))));
	}
}
