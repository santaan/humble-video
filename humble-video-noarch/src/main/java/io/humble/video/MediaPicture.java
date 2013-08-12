/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
public class MediaPicture extends MediaSampled {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    Buffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected MediaPicture(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.MediaPicture_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected MediaPicture(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.MediaPicture_SWIGUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(MediaPicture obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new MediaPicture object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public MediaPicture copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new MediaPicture(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof MediaPicture)
      equal = (((MediaPicture)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  
  /**
   * info about this picture
   * @return information about this picture
   */
  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder();
    
    result.append(this.getClass().getName()+"@"+hashCode()+"[");
    result.append("width:"+getWidth()+";");
    result.append("height:"+getHeight()+";");
    result.append("format:"+getFormat()+";");
    result.append("time stamp:"+getTimeStamp()+";");
    result.append("complete:"+isComplete()+";");
    result.append("key:"+isKey()+";");
    Rational timeBase = Global.getDefaultTimeBase();
    result.append("time base:"+timeBase+";");
    for(int i = 0; i < getNumDataPlanes(); i++)
      result.append("plane["+i+"] size: " + getDataPlaneSize(i) +";"); 
    if (timeBase != null) timeBase.delete();
    result.append("]");
    return result.toString();
  }


/**
 * Create a media picture.<br>
 * <br>
 * @param width Number of pixels wide.<br>
 * @param height Number of pixels high.<br>
 * @param format PixelFormat.Type of the MediaPicture<br>
 * <br>
 * @return A MediaPicture with memory allocated for it.<br>
 * <br>
 * @throws InvalidArgument if width or height or negative, of format is PixelFormat.Type.PIX_FMT_NONE
 */
  public static MediaPicture make(int width, int height, PixelFormat.Type format) {
    long cPtr = VideoJNI.MediaPicture_make__SWIG_0(width, height, format.swigValue());
    return (cPtr == 0) ? null : new MediaPicture(cPtr, false);
  }

/**
 * Create a media picture using a buffer as the memory backing it.<br>
 * <br>
 * @param buffer A buffer of data to use for the image.<br>
 * @param width Number of pixels wide.<br>
 * @param height Number of pixels high.<br>
 * @param format PixelFormat.Type of the MediaPicture<br>
 * <br>
 * @return A MediaPicture with memory allocated for it.<br>
 * <br>
 * @throws InvalidArgument if buffer is null or too small for the image, width or height or negative, of format is PixelFormat.Type.PIX_FMT_NONE
 */
  public static MediaPicture make(Buffer buffer, int width, int height, PixelFormat.Type format) {
    long cPtr = VideoJNI.MediaPicture_make__SWIG_1(Buffer.getCPtr(buffer), buffer, width, height, format.swigValue());
    return (cPtr == 0) ? null : new MediaPicture(cPtr, false);
  }

/**
 * Create a media picture from src.<br>
 * <br>
 * @param src A source MediaPicture.<br>
 * @param copy If true then all data is copied from src into the new object. If false, then the new object just copies meta-data but references the same underlying buffers.<br>
 * <br>
 * @return A MediaPicture<br>
 * <br>
 * @throws InvalidArgument if src is null.
 */
  public static MediaPicture make(MediaPicture src, boolean copy) {
    long cPtr = VideoJNI.MediaPicture_make__SWIG_2(MediaPicture.getCPtr(src), src, copy);
    return (cPtr == 0) ? null : new MediaPicture(cPtr, false);
  }

/**
 * Get any underlying raw data available for this object.<br>
 * <br>
 * @param plane The plane number if getFormat() is Planar (rather than packed) image data.  Pass zero for packed data.<br>
 * @return The raw data, or null if not accessible.
 */
  public Buffer getData(int plane) {
    long cPtr = VideoJNI.MediaPicture_getData(swigCPtr, this, plane);
    return (cPtr == 0) ? null : new Buffer(cPtr, false);
  }

/**
 * The total number of bytes in #getData() that represent valid image data.<br>
 * <br>
 * @return The size in bytes of that plane of image data.
 */
  public int getDataPlaneSize(int plane) {
    return VideoJNI.MediaPicture_getDataPlaneSize(swigCPtr, this, plane);
  }

/**
 * Returns the number of data planes in this object. 
 */
  public int getNumDataPlanes() {
    return VideoJNI.MediaPicture_getNumDataPlanes(swigCPtr, this);
  }

/**
 * The width in pixels of a line of the image in the given plane.<br>
 * The plane from the data. Not all images have more than one plane. None have more than 4.<br>
 * @return The width in pixels, or 0 on error.
 */
  public int getLineSize(int plane) {
    return VideoJNI.MediaPicture_getLineSize(swigCPtr, this, plane);
  }

/**
 * Set this frame to complete.
 */
  public void setComplete(boolean complete) {
    VideoJNI.MediaPicture_setComplete(swigCPtr, this, complete);
  }

/**
 * Returns true if the data in this picture is marked as complete.<br>
 * @see #setComplete(int)
 */
  public boolean isComplete() {
    return VideoJNI.MediaPicture_isComplete(swigCPtr, this);
  }

  public int getWidth() {
    return VideoJNI.MediaPicture_getWidth(swigCPtr, this);
  }

  public int getHeight() {
    return VideoJNI.MediaPicture_getHeight(swigCPtr, this);
  }

  public PixelFormat.Type getFormat() {
    return PixelFormat.Type.swigToEnum(VideoJNI.MediaPicture_getFormat(swigCPtr, this));
  }

/**
 * picture number in bitstream order
 */
  public int getCodedPictureNumber() {
    return VideoJNI.MediaPicture_getCodedPictureNumber(swigCPtr, this);
  }

/**
 * set picture number<br>
 * @see #getCodedPictureNumber()
 */
  public void setCodedPictureNumber(int n) {
    VideoJNI.MediaPicture_setCodedPictureNumber(swigCPtr, this, n);
  }

/**
 * picture number in display order
 */
  public int getDisplayPictureNumber() {
    return VideoJNI.MediaPicture_getDisplayPictureNumber(swigCPtr, this);
  }

/**
 * set picture number in display order<br>
 * @see #getDisplayPictureNumber
 */
  public void setDisplayPictureNumber(int n) {
    VideoJNI.MediaPicture_setDisplayPictureNumber(swigCPtr, this, n);
  }

/**
 * quality (between 1 (good) and FF_LAMBDA_MAX (bad))
 */
  public int getQuality() {
    return VideoJNI.MediaPicture_getQuality(swigCPtr, this);
  }

/**
 * set quality.<br>
 * @see #getQuality()
 */
  public void setQuality(int q) {
    VideoJNI.MediaPicture_setQuality(swigCPtr, this, q);
  }

/**
 * Get the error flags (if any) that the decoder set for this image on any given plane.<br>
 * @param dataPlane The plane to search for error flags.
 */
  public long getError(int dataPlane) {
    return VideoJNI.MediaPicture_getError(swigCPtr, this, dataPlane);
  }

/**
 * When decoding, this signals how much the picture must be delayed.<br>
 * extra_delay = repeat_pict / (2*fps)
 */
  public int getRepeatPicture() {
    return VideoJNI.MediaPicture_getRepeatPicture(swigCPtr, this);
  }

  public void setRepeatPicture(int n) {
    VideoJNI.MediaPicture_setRepeatPicture(swigCPtr, this, n);
  }

/**
 * The content of the picture is interlaced.
 */
  public boolean isInterlacedFrame() {
    return VideoJNI.MediaPicture_isInterlacedFrame(swigCPtr, this);
  }

  public void setInterlacedFrame(boolean val) {
    VideoJNI.MediaPicture_setInterlacedFrame(swigCPtr, this, val);
  }

/**
 * If the content is interlaced, is top field displayed first.
 */
  public boolean isTopFieldFirst() {
    return VideoJNI.MediaPicture_isTopFieldFirst(swigCPtr, this);
  }

  public void setTopFieldFirst(boolean val) {
    VideoJNI.MediaPicture_setTopFieldFirst(swigCPtr, this, val);
  }

/**
 * Tell user application that palette has changed from previous frame.
 */
  public boolean isPaletteChanged() {
    return VideoJNI.MediaPicture_isPaletteChanged(swigCPtr, this);
  }

  public void setPaletteChange(boolean val) {
    VideoJNI.MediaPicture_setPaletteChange(swigCPtr, this, val);
  }

/**
 * Get the type of picture this object was decoded from when in a encoded stream<br>
 * (or give a hint to an encoder about how you think it should be encoded).
 */
  public MediaPicture.Type getType() {
    return MediaPicture.Type.swigToEnum(VideoJNI.MediaPicture_getType(swigCPtr, this));
  }

  public void setType(MediaPicture.Type type) {
    VideoJNI.MediaPicture_setType(swigCPtr, this, type.swigValue());
  }

  /**
   * The different types of images that we can set.<br>
   * <br>
   * @see #getPictureType()
   */
  public enum Type {
  /**
   * Undefined 
   */
    PICTURE_TYPE_NONE(VideoJNI.MediaPicture_PICTURE_TYPE_NONE_get()),
  /**
   * Intra 
   */
    PICTURE_TYPE_I(VideoJNI.MediaPicture_PICTURE_TYPE_I_get()),
  /**
   * Predicted 
   */
    PICTURE_TYPE_P(VideoJNI.MediaPicture_PICTURE_TYPE_P_get()),
  /**
   * Bi-dir predicted 
   */
    PICTURE_TYPE_B(VideoJNI.MediaPicture_PICTURE_TYPE_B_get()),
  /**
   * S(GMC)-VOP MPEG4 
   */
    PICTURE_TYPE_S(VideoJNI.MediaPicture_PICTURE_TYPE_S_get()),
  /**
   * Switching Intra 
   */
    PICTURE_TYPE_SI(VideoJNI.MediaPicture_PICTURE_TYPE_SI_get()),
  /**
   * Switching Predicted 
   */
    PICTURE_TYPE_SP(VideoJNI.MediaPicture_PICTURE_TYPE_SP_get()),
  /**
   * BI type 
   */
    PICTURE_TYPE_BI(VideoJNI.MediaPicture_PICTURE_TYPE_BI_get()),
  ;

    public final int swigValue() {
      return swigValue;
    }

    public static Type swigToEnum(int swigValue) {
      Type[] swigValues = Type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Type(Type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
