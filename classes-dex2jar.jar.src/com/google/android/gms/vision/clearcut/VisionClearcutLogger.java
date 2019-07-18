package com.google.android.gms.vision.clearcut;

import WK;
import Zp;
import Zp.a;
import android.content.Context;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.vision.L;
import gO;
import wL;

@Keep
public class VisionClearcutLogger
{
  private final Zp zzbw;
  private boolean zzbx = true;
  
  public VisionClearcutLogger(Context paramContext)
  {
    this.zzbw = new Zp(paramContext, "VISION", null);
  }
  
  public final void zzb(int paramInt, wL paramwL)
  {
    byte[] arrayOfByte = new byte[paramwL.a()];
    gO.a(paramwL, arrayOfByte, 0, arrayOfByte.length);
    if ((paramInt >= 0) && (paramInt <= 3)) {
      try
      {
        if (this.zzbx)
        {
          paramwL = this.zzbw.a(arrayOfByte);
          paramwL.a(paramInt);
          paramwL.a();
          return;
        }
        paramwL = new wL;
        paramwL.<init>();
        try
        {
          gO.a(paramwL, arrayOfByte);
          L.zzc("Would have logged:\n%s", new Object[] { paramwL.toString() });
          return;
        }
        catch (Exception paramwL)
        {
          L.zza(paramwL, "Parsing error", new Object[0]);
          return;
        }
        paramwL = new StringBuilder(31);
      }
      catch (Exception paramwL)
      {
        WK.a(paramwL);
        L.zza(paramwL, "Failed to log", new Object[0]);
        return;
      }
    }
    paramwL.append("Illegal event code: ");
    paramwL.append(paramInt);
    paramwL = paramwL.toString();
    if (L.isLoggable(4)) {
      Log.i("Vision", String.format(paramwL, new Object[0]));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/vision/clearcut/VisionClearcutLogger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */