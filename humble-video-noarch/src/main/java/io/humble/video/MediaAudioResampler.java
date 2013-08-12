/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
/**
 * A MediaAudioResampler object resamples MediaAudio objects from<br>
 * one format/sample-rate/channel-layout to another.
 */
import io.humble.ferry.*;
public class MediaAudioResampler extends Configurable {
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
  protected MediaAudioResampler(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.MediaAudioResampler_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected MediaAudioResampler(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.MediaAudioResampler_SWIGUpcast(cPtr),
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
  protected static long getCPtr(MediaAudioResampler obj) {
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
   * Create a new MediaAudioResampler object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public MediaAudioResampler copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new MediaAudioResampler(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof MediaAudioResampler)
      equal = (((MediaAudioResampler)obj).swigCPtr == this.swigCPtr);
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
 * Create a new MediaAudioResampler.
 */
  public static MediaAudioResampler make(AudioChannel.Layout outLayout, int outSampleRate, AudioFormat.Type outFormat, AudioChannel.Layout inLayout, int inSampleRate, AudioFormat.Type inFormat) {
    long cPtr = VideoJNI.MediaAudioResampler_make(outLayout.swigValue(), outSampleRate, outFormat.swigValue(), inLayout.swigValue(), inSampleRate, inFormat.swigValue());
    return (cPtr == 0) ? null : new MediaAudioResampler(cPtr, false);
  }

/**
 * Get output channel layout.
 */
  public AudioChannel.Layout getOutputLayout() {
    return AudioChannel.Layout.swigToEnum(VideoJNI.MediaAudioResampler_getOutputLayout(swigCPtr, this));
  }

/**
 * Get input channel layout.
 */
  public AudioChannel.Layout getInputLayout() {
    return AudioChannel.Layout.swigToEnum(VideoJNI.MediaAudioResampler_getInputLayout(swigCPtr, this));
  }

/**
 * Get output sample rate.
 */
  public int getOutputSampleRate() {
    return VideoJNI.MediaAudioResampler_getOutputSampleRate(swigCPtr, this);
  }

/**
 * Get input sample rate.
 */
  public int getInputSampleRate() {
    return VideoJNI.MediaAudioResampler_getInputSampleRate(swigCPtr, this);
  }

/**
 * Get output audio format.
 */
  public AudioFormat.Type getOutputFormat() {
    return AudioFormat.Type.swigToEnum(VideoJNI.MediaAudioResampler_getOutputFormat(swigCPtr, this));
  }

/**
 * Get input audio format.
 */
  public AudioFormat.Type getInputFormat() {
    return AudioFormat.Type.swigToEnum(VideoJNI.MediaAudioResampler_getInputFormat(swigCPtr, this));
  }

/**
 * Get number of input channels (derived from #getInputLayout()).
 */
  public int getInputChannels() {
    return VideoJNI.MediaAudioResampler_getInputChannels(swigCPtr, this);
  }

/**
 * Get number of output channels (derived from #getOutputLayout()).
 */
  public int getOutputChannels() {
    return VideoJNI.MediaAudioResampler_getOutputChannels(swigCPtr, this);
  }

/**
 * Opens the resampler so it can be ready for resampling.<br>
 * You should NOT set options after you open this object.
 */
  public void open() {
    VideoJNI.MediaAudioResampler_open(swigCPtr, this);
  }

/**
 * Convert audio.<br>
 * <br>
 * in can be set to null to flush the last few samples out at the<br>
 * end.<br>
 * <br>
 * If more input is provided than output space then the input will be buffered.<br>
 * You can avoid this buffering by providing more output space than input.<br>
 * Conversion will run directly without copying whenever possible.<br>
 * <br>
 * @param out       output audio object. caller is responsible for making the correct size.<br>
 * @param in        input audio.<br>
 * <br>
 * @return number of samples output per channel.<br>
 * @throws RuntimeError if we get an error or InvalidArgument if the attributes of<br>
 *   in or out do not match what this resampler expected.
 */
  public int resample(MediaAudio out, MediaAudio in) {
    return VideoJNI.MediaAudioResampler_resample(swigCPtr, this, MediaAudio.getCPtr(out), out, MediaAudio.getCPtr(in), in);
  }

/**
 * Convert the next timestamp from input to output<br>
 * timestamps are in 1/(in_sample_rate * out_sample_rate) units.<br>
 * <br>
 * Note: There are 2 slightly differently behaving modes.<br>
 *       First is when automatic timestamp compensation is not used, (min_compensation &gt;= FLT_MAX)<br>
 *              in this case timestamps will be passed through with delays compensated<br>
 *       Second is when automatic timestamp compensation is used, (min_compensation &lt; FLT_MAX)<br>
 *              in this case the output timestamps will match output sample numbers<br>
 * <br>
 * @param pts   timestamp for the next input sample, INT64_MIN if unknown<br>
 * @return the output timestamp for the next output sample
 */
  public long getNextPts(long pts) {
    return VideoJNI.MediaAudioResampler_getNextPts(swigCPtr, this, pts);
  }

/**
 * Activate resampling compensation.
 */
  public void setCompensation(int sample_delta, int compensation_distance) {
    VideoJNI.MediaAudioResampler_setCompensation(swigCPtr, this, sample_delta, compensation_distance);
  }

/**
 * Set a customized input channel mapping.<br>
 * <br>
 * <br>
 * @return AVERROR error code in case of failure.<br>
 * <br>
 * Set a customized remix matrix.<br>
 * <br>
 * <br>
 * <br>
 * @return AVERROR error code in case of failure.<br>
 * <br>
 * Drops the specified number of output samples.<br>
 * @return # of samples dropped.
 */
  public int dropOutput(int count) {
    return VideoJNI.MediaAudioResampler_dropOutput(swigCPtr, this, count);
  }

/**
 * Injects the specified number of silence samples.<br>
 * @return # of samples injected.
 */
  public int injectSilence(int count) {
    return VideoJNI.MediaAudioResampler_injectSilence(swigCPtr, this, count);
  }

/**
 * Gets the delay the next input sample will experience relative to the next output sample.<br>
 * <br>
 * The resampler can buffer data if more input has been provided than available<br>
 * output space, also converting between sample rates needs a delay.<br>
 * This function returns the sum of all such delays.<br>
 * The exact delay is not necessarily an integer value in either input or<br>
 * output sample rate. Especially when downsampling by a large value, the<br>
 * output sample rate may be a poor choice to represent the delay, similarly<br>
 * for upsampling and the input sample rate.<br>
 * <br>
 * @param base  timebase in which the returned delay will be<br>
 *              if its set to 1 the returned delay is in seconds<br>
 *              if its set to 1000 the returned delay is in milli seconds<br>
 *              if its set to the input sample rate then the returned delay is in input samples<br>
 *              if its set to the output sample rate then the returned delay is in output samples<br>
 *              an exact rounding free delay can be found by using LCM(in_sample_rate, out_sample_rate)<br>
 * @return the delay in 1/base units.
 */
  public long getDelay(long base) {
    return VideoJNI.MediaAudioResampler_getDelay(swigCPtr, this, base);
  }

/**
 * Returns the number of resampled samples (rounded up) that would<br>
 * be required when resampling a given number of samples.<br>
 * That was a mouthful, yes? So here's the way to think of this. If your input<br>
 * audio is at 48000 hz, and you pass in 0.5 seconds of audio, that's 24,000 input samples.<br>
 * But if you're resampling to 22050 hz, then 0.5 seconds of audio is 11,025 output samples.<br>
 * So <code>getNumResampledSamples(24000)</code> would return <code>11025</code> if the input<br>
 * sample rate was 48,000 and hte output was 22,050.
 */
  public int getNumResampledSamples(int numSamples) {
    return VideoJNI.MediaAudioResampler_getNumResampledSamples(swigCPtr, this, numSamples);
  }

  public MediaAudioResampler.State getState() {
    return MediaAudioResampler.State.swigToEnum(VideoJNI.MediaAudioResampler_getState(swigCPtr, this));
  }

  public enum State {
    STATE_INITED,
    STATE_OPENED,
    STATE_ERROR,
  ;

    public final int swigValue() {
      return swigValue;
    }

    public static State swigToEnum(int swigValue) {
      State[] swigValues = State.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (State swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + State.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private State() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private State(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private State(State swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
