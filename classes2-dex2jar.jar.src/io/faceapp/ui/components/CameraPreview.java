package io.faceapp.ui.components;

import Aja;
import QQa;
import _Va;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Display;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.WindowManager;
import eY;
import gRa;
import oXa;

public final class CameraPreview
  extends TextureView
  implements TextureView.SurfaceTextureListener
{
  private Aja a;
  
  public CameraPreview(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    Object localObject = getContext();
    if (localObject != null)
    {
      localObject = ((Activity)localObject).getWindowManager();
      oXa.a(localObject, "(context as Activity).windowManager");
      localObject = ((WindowManager)localObject).getDefaultDisplay();
      oXa.a(localObject, "(context as Activity).windowManager.defaultDisplay");
      int i = ((Display)localObject).getRotation();
      int j = 0;
      int k;
      if ((i != 0) && (i != 2))
      {
        k = j;
        if (i != 1) {
          k = j;
        }
      }
      else
      {
        k = 1;
      }
      localObject = this.a;
      if (localObject != null)
      {
        j = ((Aja)localObject).o();
        localObject = this.a;
        if (localObject != null)
        {
          i = ((Aja)localObject).k();
          if (k != 0)
          {
            localObject = this.a;
            if (localObject != null)
            {
              j = ((Aja)localObject).k();
              localObject = this.a;
              if (localObject != null)
              {
                i = ((Aja)localObject).o();
              }
              else
              {
                oXa.b("cameraManager");
                throw null;
              }
            }
            else
            {
              oXa.b("cameraManager");
              throw null;
            }
          }
          a(j, i, paramInt1, paramInt2);
          return;
        }
        oXa.b("cameraManager");
        throw null;
      }
      oXa.b("cameraManager");
      throw null;
    }
    throw new _Va("null cannot be cast to non-null type android.app.Activity");
  }
  
  private final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = paramInt1;
    float f2 = paramInt3;
    float f3 = f1 / f2;
    float f4 = paramInt2;
    float f5 = paramInt4;
    float f6 = f4 / f5;
    float f7 = Math.max(1.0F / f3, 1.0F / f6);
    float f8 = 2;
    f1 = (f2 - f1 * f7) / f8;
    f5 = (f5 - f4 * f7) / f8;
    Matrix localMatrix = new Matrix();
    localMatrix.setScale(f3 * f7, f6 * f7);
    localMatrix.postTranslate(f1, f5);
    setTransform(localMatrix);
  }
  
  public final void a()
  {
    setSurfaceTextureListener(this);
    Object localObject = this.a;
    if (localObject != null)
    {
      localObject = ((Aja)localObject).d().a(gRa.a()).a(e.a);
      oXa.a(localObject, "cameraManager.cameraPrev….filter { it.first != 0 }");
      eY.a((QQa)localObject, this).c(new f(this));
      return;
    }
    oXa.b("cameraManager");
    throw null;
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    Aja localAja = this.a;
    if (localAja != null)
    {
      localAja.a(paramSurfaceTexture);
      return;
    }
    oXa.b("cameraManager");
    throw null;
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    paramSurfaceTexture = this.a;
    if (paramSurfaceTexture != null)
    {
      paramSurfaceTexture.a(null);
      return true;
    }
    oXa.b("cameraManager");
    throw null;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2);
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public final void setCameraManager(Aja paramAja)
  {
    oXa.b(paramAja, "cameraManager");
    this.a = paramAja;
    a();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/CameraPreview.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */