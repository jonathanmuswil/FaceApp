package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

final class b
  extends AsyncTask<Void, Void, a>
{
  private final WeakReference<CropImageView> a;
  private final Uri b;
  private final Context c;
  private final int d;
  private final int e;
  
  public b(CropImageView paramCropImageView, Uri paramUri)
  {
    this.b = paramUri;
    this.a = new WeakReference(paramCropImageView);
    this.c = paramCropImageView.getContext();
    paramCropImageView = paramCropImageView.getResources().getDisplayMetrics();
    float f = paramCropImageView.density;
    double d1;
    if (f > 1.0F) {
      d1 = 1.0F / f;
    } else {
      d1 = 1.0D;
    }
    this.d = ((int)(paramCropImageView.widthPixels * d1));
    this.e = ((int)(paramCropImageView.heightPixels * d1));
  }
  
  public Uri a()
  {
    return this.b;
  }
  
  protected a a(Void... paramVarArgs)
  {
    try
    {
      if (!isCancelled())
      {
        c.a locala = c.a(this.c, this.b, this.d, this.e);
        if (!isCancelled())
        {
          paramVarArgs = c.a(locala.a, this.c, this.b);
          paramVarArgs = new a(this.b, paramVarArgs.a, locala.b, paramVarArgs.b);
          return paramVarArgs;
        }
      }
      return null;
    }
    catch (Exception paramVarArgs) {}
    return new a(this.b, paramVarArgs);
  }
  
  protected void a(a parama)
  {
    if (parama != null)
    {
      int i = 0;
      int j = i;
      if (!isCancelled())
      {
        CropImageView localCropImageView = (CropImageView)this.a.get();
        j = i;
        if (localCropImageView != null)
        {
          j = 1;
          localCropImageView.a(parama);
        }
      }
      if (j == 0)
      {
        parama = parama.b;
        if (parama != null) {
          parama.recycle();
        }
      }
    }
  }
  
  public static final class a
  {
    public final Uri a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final Exception e;
    
    a(Uri paramUri, Bitmap paramBitmap, int paramInt1, int paramInt2)
    {
      this.a = paramUri;
      this.b = paramBitmap;
      this.c = paramInt1;
      this.d = paramInt2;
      this.e = null;
    }
    
    a(Uri paramUri, Exception paramException)
    {
      this.a = paramUri;
      this.b = null;
      this.c = 0;
      this.d = 0;
      this.e = paramException;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/theartofdev/edmodo/cropper/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */