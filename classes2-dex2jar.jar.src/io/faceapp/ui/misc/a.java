package io.faceapp.ui.misc;

import _Va;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import eg;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import nYa;
import oXa;
import wBa;
import xBa;
import yh;

public final class a
  extends yh
{
  private final String a;
  
  public a(String paramString)
  {
    this.a = paramString;
  }
  
  protected Bitmap a(eg parameg, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    oXa.b(parameg, "pool");
    oXa.b(paramBitmap, "toTransform");
    paramBitmap = paramBitmap.copy(Bitmap.Config.ARGB_8888, true);
    parameg = xBa.a;
    oXa.a(paramBitmap, "it");
    parameg.a(paramBitmap, new wBa(1.0F, this.a));
    oXa.a(paramBitmap, "toTransform.copy(Bitmap.… value = 1.0f))\n        }");
    return paramBitmap;
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    oXa.b(paramMessageDigest, "messageDigest");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("GlideEffectPhotoTransform_#");
    ((StringBuilder)localObject).append(this.a);
    String str = ((StringBuilder)localObject).toString();
    localObject = nYa.a;
    if (str != null)
    {
      localObject = str.getBytes((Charset)localObject);
      oXa.a(localObject, "(this as java.lang.String).getBytes(charset)");
      paramMessageDigest.update((byte[])localObject);
      return;
    }
    throw new _Va("null cannot be cast to non-null type java.lang.String");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */