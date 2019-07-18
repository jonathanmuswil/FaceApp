package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

final class a
  extends AsyncTask<Void, Void, a>
{
  private final WeakReference<CropImageView> a;
  private final Bitmap b;
  private final Uri c;
  private final Context d;
  private final float[] e;
  private final int f;
  private final int g;
  private final int h;
  private final boolean i;
  private final int j;
  private final int k;
  private final int l;
  private final int m;
  private final boolean n;
  private final boolean o;
  private final CropImageView.i p;
  private final Uri q;
  private final Bitmap.CompressFormat r;
  private final int s;
  
  a(CropImageView paramCropImageView, Bitmap paramBitmap, float[] paramArrayOfFloat, int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean2, boolean paramBoolean3, CropImageView.i parami, Uri paramUri, Bitmap.CompressFormat paramCompressFormat, int paramInt6)
  {
    this.a = new WeakReference(paramCropImageView);
    this.d = paramCropImageView.getContext();
    this.b = paramBitmap;
    this.e = paramArrayOfFloat;
    this.c = null;
    this.f = paramInt1;
    this.i = paramBoolean1;
    this.j = paramInt2;
    this.k = paramInt3;
    this.l = paramInt4;
    this.m = paramInt5;
    this.n = paramBoolean2;
    this.o = paramBoolean3;
    this.p = parami;
    this.q = paramUri;
    this.r = paramCompressFormat;
    this.s = paramInt6;
    this.g = 0;
    this.h = 0;
  }
  
  a(CropImageView paramCropImageView, Uri paramUri1, float[] paramArrayOfFloat, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean2, boolean paramBoolean3, CropImageView.i parami, Uri paramUri2, Bitmap.CompressFormat paramCompressFormat, int paramInt8)
  {
    this.a = new WeakReference(paramCropImageView);
    this.d = paramCropImageView.getContext();
    this.c = paramUri1;
    this.e = paramArrayOfFloat;
    this.f = paramInt1;
    this.i = paramBoolean1;
    this.j = paramInt4;
    this.k = paramInt5;
    this.g = paramInt2;
    this.h = paramInt3;
    this.l = paramInt6;
    this.m = paramInt7;
    this.n = paramBoolean2;
    this.o = paramBoolean3;
    this.p = parami;
    this.q = paramUri2;
    this.r = paramCompressFormat;
    this.s = paramInt8;
    this.b = null;
  }
  
  protected a a(Void... paramVarArgs)
  {
    boolean bool = true;
    try
    {
      if (!isCancelled())
      {
        if (this.c != null)
        {
          paramVarArgs = c.a(this.d, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        else
        {
          if (this.b == null) {
            break label202;
          }
          paramVarArgs = c.a(this.b, this.e, this.f, this.i, this.j, this.k, this.n, this.o);
        }
        Bitmap localBitmap = c.a(paramVarArgs.a, this.l, this.m, this.p);
        if (this.q == null) {
          return new a(localBitmap, paramVarArgs.b);
        }
        c.a(this.d, localBitmap, this.q, this.r, this.s);
        if (localBitmap != null) {
          localBitmap.recycle();
        }
        return new a(this.q, paramVarArgs.b);
        label202:
        paramVarArgs = new a(null, 1);
        return paramVarArgs;
      }
      return null;
    }
    catch (Exception paramVarArgs)
    {
      if (this.q == null) {
        bool = false;
      }
    }
    return new a(paramVarArgs, bool);
  }
  
  protected void a(a parama)
  {
    if (parama != null)
    {
      int i1 = 0;
      int i2 = i1;
      if (!isCancelled())
      {
        CropImageView localCropImageView = (CropImageView)this.a.get();
        i2 = i1;
        if (localCropImageView != null)
        {
          i2 = 1;
          localCropImageView.a(parama);
        }
      }
      if (i2 == 0)
      {
        parama = parama.a;
        if (parama != null) {
          parama.recycle();
        }
      }
    }
  }
  
  static final class a
  {
    public final Bitmap a;
    public final Uri b;
    final Exception c;
    final boolean d;
    final int e;
    
    a(Bitmap paramBitmap, int paramInt)
    {
      this.a = paramBitmap;
      this.b = null;
      this.c = null;
      this.d = false;
      this.e = paramInt;
    }
    
    a(Uri paramUri, int paramInt)
    {
      this.a = null;
      this.b = paramUri;
      this.c = null;
      this.d = true;
      this.e = paramInt;
    }
    
    a(Exception paramException, boolean paramBoolean)
    {
      this.a = null;
      this.b = null;
      this.c = paramException;
      this.d = paramBoolean;
      this.e = 1;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/theartofdev/edmodo/cropper/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */