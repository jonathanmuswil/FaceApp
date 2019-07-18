package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

@yh
final class rn
  implements SensorEventListener
{
  private final SensorManager a;
  private final Object b;
  private final Display c;
  private final float[] d;
  private final float[] e;
  private float[] f;
  private Handler g;
  private tn h;
  
  rn(Context paramContext)
  {
    this.a = ((SensorManager)paramContext.getSystemService("sensor"));
    this.c = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    this.d = new float[9];
    this.e = new float[9];
    this.b = new Object();
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    float[] arrayOfFloat = this.e;
    float f1 = arrayOfFloat[paramInt1];
    arrayOfFloat[paramInt1] = arrayOfFloat[paramInt2];
    arrayOfFloat[paramInt2] = f1;
  }
  
  final void a()
  {
    if (this.g != null) {
      return;
    }
    Sensor localSensor = this.a.getDefaultSensor(11);
    if (localSensor == null)
    {
      Tl.b("No Sensor of TYPE_ROTATION_VECTOR");
      return;
    }
    HandlerThread localHandlerThread = new HandlerThread("OrientationMonitor");
    localHandlerThread.start();
    this.g = new bN(localHandlerThread.getLooper());
    if (!this.a.registerListener(this, localSensor, 0, this.g))
    {
      Tl.b("SensorManager.registerListener failed.");
      b();
    }
  }
  
  final void a(tn paramtn)
  {
    this.h = paramtn;
  }
  
  final boolean a(float[] paramArrayOfFloat)
  {
    synchronized (this.b)
    {
      if (this.f == null) {
        return false;
      }
      System.arraycopy(this.f, 0, paramArrayOfFloat, 0, this.f.length);
      return true;
    }
  }
  
  final void b()
  {
    if (this.g == null) {
      return;
    }
    this.a.unregisterListener(this);
    this.g.post(new sn(this));
    this.g = null;
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent arg1)
  {
    ??? = ???.values;
    if ((???[0] != 0.0F) || (???[1] != 0.0F) || (???[2] != 0.0F)) {}
    synchronized (this.b)
    {
      if (this.f == null) {
        this.f = new float[9];
      }
      SensorManager.getRotationMatrixFromVector(this.d, (float[])???);
      int i = this.c.getRotation();
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            System.arraycopy(this.d, 0, this.e, 0, 9);
          } else {
            SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
          }
        }
        else {
          SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
        }
      }
      else {
        SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
      }
      a(1, 3);
      a(2, 6);
      a(5, 7);
      synchronized (this.b)
      {
        System.arraycopy(this.e, 0, this.f, 0, 9);
        ??? = this.h;
        if (??? != null) {
          ???.a();
        }
        return;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */