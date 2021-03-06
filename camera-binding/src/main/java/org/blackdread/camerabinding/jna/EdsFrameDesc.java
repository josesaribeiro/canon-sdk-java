/*
 * MIT License
 *
 * Copyright (c) 2018-2019 Yoann CAPLAIN
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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
public class EdsFrameDesc extends Structure {
	/** C type : EdsUInt32 */
	public NativeLong valid;
	/** C type : EdsUInt32 */
	public NativeLong selected;
	/** C type : EdsUInt32 */
	public NativeLong justFocus;
	/** C type : EdsRect */
	public EdsRect rect;
	/** C type : EdsUInt32 */
	public NativeLong reserved;
	public EdsFrameDesc() {
		super();
	}
    @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("valid", "selected", "justFocus", "rect", "reserved");
	}
	/**
	 * @param valid C type : EdsUInt32<br>
	 * @param selected C type : EdsUInt32<br>
	 * @param justFocus C type : EdsUInt32<br>
	 * @param rect C type : EdsRect<br>
	 * @param reserved C type : EdsUInt32
	 */
	public EdsFrameDesc(NativeLong valid, NativeLong selected, NativeLong justFocus, EdsRect rect, NativeLong reserved) {
		super();
		this.valid = valid;
		this.selected = selected;
		this.justFocus = justFocus;
		this.rect = rect;
		this.reserved = reserved;
	}
	public EdsFrameDesc(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsFrameDesc implements Structure.ByReference {
		
	}
	public static class ByValue extends EdsFrameDesc implements Structure.ByValue {
		
	}
}
