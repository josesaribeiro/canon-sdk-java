package org.blackdread.camerabinding.jna;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : sdk-header\EDSDKTypes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsFocusInfo extends Structure {
	/** C type : EdsRect */
	public EdsRect imageRect;
	/** C type : EdsUInt32 */
	public NativeLong pointNumber;
	/** C type : EdsFocusPoint[600] */
	public EdsFrameDesc[] focusPoint = new EdsFrameDesc[600];
	/** C type : EdsUInt32 */
	public NativeLong executeMode;
	public EdsFocusInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("imageRect", "pointNumber", "focusPoint", "executeMode");
	}
	/**
	 * @param imageRect C type : EdsRect<br>
	 * @param pointNumber C type : EdsUInt32<br>
	 * @param focusPoint C type : EdsFocusPoint[600]<br>
	 * @param executeMode C type : EdsUInt32
	 */
	public EdsFocusInfo(EdsRect imageRect, NativeLong pointNumber, EdsFrameDesc focusPoint[], NativeLong executeMode) {
		super();
		this.imageRect = imageRect;
		this.pointNumber = pointNumber;
		if ((focusPoint.length != this.focusPoint.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.focusPoint = focusPoint;
		this.executeMode = executeMode;
	}
	public EdsFocusInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsFocusInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends EdsFocusInfo implements Structure.ByValue {
		
	};
}