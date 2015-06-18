package com.techmanual.chapterthree.instantiation;

//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2015/6/18<p>
//-------------------------------------------------------

public class MusicBoxFactory {
    public static IMusicBox createMusicBox(){
        return new IMusicBox() {
            @Override public void play() {
                System.out.println("paly music~~");
            }
        };
    }
}
