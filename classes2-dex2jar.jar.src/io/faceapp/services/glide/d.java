package io.faceapp.services.glide;

import Ae;
import Ei;
import Ke;
import Ki;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import gj;

public class d
  extends Ke
{
  public d(Ae paramAe, Ei paramEi, Ki paramKi, Context paramContext)
  {
    super(paramAe, paramEi, paramKi, paramContext);
  }
  
  public c<Bitmap> a()
  {
    return (c)super.a();
  }
  
  public c<Drawable> a(Bitmap paramBitmap)
  {
    return (c)super.a(paramBitmap);
  }
  
  public c<Drawable> a(Uri paramUri)
  {
    return (c)super.a(paramUri);
  }
  
  public <ResourceType> c<ResourceType> a(Class<ResourceType> paramClass)
  {
    return new c(this.d, this, paramClass, this.e);
  }
  
  public c<Drawable> a(Integer paramInteger)
  {
    return (c)super.a(paramInteger);
  }
  
  public c<Drawable> a(String paramString)
  {
    return (c)super.a(paramString);
  }
  
  protected void a(gj paramgj)
  {
    if ((paramgj instanceof b)) {
      super.a(paramgj);
    } else {
      super.a(new b().a(paramgj));
    }
  }
  
  public c<Drawable> b()
  {
    return (c)super.b();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/services/glide/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */