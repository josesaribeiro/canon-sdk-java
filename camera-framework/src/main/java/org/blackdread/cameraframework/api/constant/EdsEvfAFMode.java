package org.blackdread.cameraframework.api.constant;

import org.blackdread.camerabinding.jna.EdsdkLibrary;
import org.blackdread.cameraframework.util.LibraryFieldUtil;

/**
 * Set/Get the AF mode for the live view.<br>
 * This property can set/get from the EOS 50D or EOS 5D Mark II or later
 * <br>
 * See API Reference - 5.2.80 kEdsPropID_Evf_AFMode
 * <p>Created on 2018/10/05.<p>
 *
 * @author Yoann CAPLAIN
 */
public enum EdsEvfAFMode implements NativeEnum<Integer> {
    Evf_AFMode_Quick("Quick Mode"),
    Evf_AFMode_Live("Live Mode"),
    Evf_AFMode_LiveFace("Live Face Mode"),
    Evf_AFMode_LiveMulti("FlexiZone - Multi");

    private final int value;
    private final String description;

    EdsEvfAFMode(final String description) {
        value = LibraryFieldUtil.getNativeIntValue(EdsdkLibrary.EdsEvfAFMode.class, name());
        this.description = description;
    }

    @Override
    public final Integer value() {
        return value;
    }

    @Override
    public final String description() {
        return description;
    }
}