package com.cfox.asymedialib.core;


public class MediaCheckRule implements CheckRule {
    @Override
    public boolean checkUpdate(MediaInfo localBean, MediaInfo mediaInfo) {
        return !localBean.getPath().equals(mediaInfo.getPath());
    }
}
