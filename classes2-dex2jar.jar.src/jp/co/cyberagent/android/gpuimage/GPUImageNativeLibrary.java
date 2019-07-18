package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;

public class GPUImageNativeLibrary
{
  static
  {
    System.loadLibrary("yuv-decoder");
  }
  
  public static native void adjustBitmap(Bitmap paramBitmap);
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/jp/co/cyberagent/android/gpuimage/GPUImageNativeLibrary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */