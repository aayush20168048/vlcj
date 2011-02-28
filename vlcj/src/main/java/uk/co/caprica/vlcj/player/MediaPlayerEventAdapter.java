/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2009, 2010, 2011 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.player;

import uk.co.caprica.vlcj.binding.internal.libvlc_media_t;

/**
 * Default implementation of the media player event listener.
 * <p>
 * Simply override the methods you're interested in.
 */
public class MediaPlayerEventAdapter implements MediaPlayerEventListener {

  // === Events relating to the media player ==================================

//  @Override
  public void mediaChanged(MediaPlayer mediaPlayer) {
  }

//  @Override
  public void opening(MediaPlayer mediaPlayer) {
  }

//  @Override
  public void buffering(MediaPlayer mediaPlayer) {
  }

//  @Override
  public void playing(MediaPlayer mediaPlayer) {
  }

//  @Override
  public void paused(MediaPlayer mediaPlayer) {
  }

//  @Override
  public void stopped(MediaPlayer mediaPlayer) {
  }

//  @Override
  public void forward(MediaPlayer mediaPlayer) {
  }

//  @Override
  public void backward(MediaPlayer mediaPlayer) {
  }

//  @Override
  public void finished(MediaPlayer mediaPlayer) {
  }

//  @Override
  public void timeChanged(MediaPlayer mediaPlayer, long newTime) {
  }

//  @Override
  public void positionChanged(MediaPlayer mediaPlayer, float newPosition) {
  }

//  @Override
  public void seekableChanged(MediaPlayer mediaPlayer, int newSeekable) {
  }

//  @Override
  public void pausableChanged(MediaPlayer mediaPlayer, int newSeekable) {
  }

//  @Override
  public void titleChanged(MediaPlayer mediaPlayer, int newSeekable) {
  }

//  @Override
  public void snapshotTaken(MediaPlayer mediaPlayer, String filename) {
  }

//  @Override
  public void lengthChanged(MediaPlayer mediaPlayer, long newLength) {
  }
  
//  @Override
  public void error(MediaPlayer mediaPlayer) {
  }
  
  // === Events relating to the current media =================================

//  @Override
  public void mediaSubItemAdded(MediaPlayer mediaPlayer, libvlc_media_t subItem) {
  }

//  @Override
  public void mediaDurationChanged(MediaPlayer mediaPlayer, long newDuration) {
  }

//  @Override
  public void mediaParsedChanged(MediaPlayer mediaPlayer, int newStatus) {
  }

//  @Override
  public void mediaFreed(MediaPlayer mediaPlayer) {
  }

//  @Override
  public void mediaStateChanged(MediaPlayer mediaPlayer, int newState) {
  }
  
//  @Override
  public void mediaMetaChanged(MediaPlayer mediaPlayer, int metaType) {
  }
}
