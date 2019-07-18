package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

public class IconCompat
  extends CustomVersionedParcelable
{
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  public int b;
  Object c;
  public byte[] d;
  public Parcelable e;
  public int f;
  public int g;
  public ColorStateList h = null;
  PorterDuff.Mode i = a;
  public String j;
  
  private static int a(Icon paramIcon)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return paramIcon.getResId();
    }
    try
    {
      int k = ((Integer)paramIcon.getClass().getMethod("getResId", new Class[0]).invoke(paramIcon, new Object[0])).intValue();
      return k;
    }
    catch (NoSuchMethodException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon resource", paramIcon);
      return 0;
    }
    catch (InvocationTargetException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon resource", paramIcon);
      return 0;
    }
    catch (IllegalAccessException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon resource", paramIcon);
    }
    return 0;
  }
  
  private static String a(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4)
          {
            if (paramInt != 5) {
              return "UNKNOWN";
            }
            return "BITMAP_MASKABLE";
          }
          return "URI";
        }
        return "DATA";
      }
      return "RESOURCE";
    }
    return "BITMAP";
  }
  
  private static String b(Icon paramIcon)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return paramIcon.getResPackage();
    }
    try
    {
      paramIcon = (String)paramIcon.getClass().getMethod("getResPackage", new Class[0]).invoke(paramIcon, new Object[0]);
      return paramIcon;
    }
    catch (NoSuchMethodException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon package", paramIcon);
      return null;
    }
    catch (InvocationTargetException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon package", paramIcon);
      return null;
    }
    catch (IllegalAccessException paramIcon)
    {
      Log.e("IconCompat", "Unable to get icon package", paramIcon);
    }
    return null;
  }
  
  public int a()
  {
    if ((this.b == -1) && (Build.VERSION.SDK_INT >= 23)) {
      return a((Icon)this.c);
    }
    if (this.b == 2) {
      return this.f;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("called getResId() on ");
    localStringBuilder.append(this);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public void a(boolean paramBoolean)
  {
    this.j = this.i.name();
    int k = this.b;
    if (k != -1)
    {
      if (k != 1) {
        if (k != 2)
        {
          if (k != 3)
          {
            if (k != 4)
            {
              if (k != 5) {
                break label181;
              }
            }
            else
            {
              this.d = this.c.toString().getBytes(Charset.forName("UTF-16"));
              break label181;
            }
          }
          else
          {
            this.d = ((byte[])this.c);
            break label181;
          }
        }
        else
        {
          this.d = ((String)this.c).getBytes(Charset.forName("UTF-16"));
          break label181;
        }
      }
      if (paramBoolean)
      {
        Bitmap localBitmap = (Bitmap)this.c;
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localBitmap.compress(Bitmap.CompressFormat.PNG, 90, localByteArrayOutputStream);
        this.d = localByteArrayOutputStream.toByteArray();
      }
      else
      {
        this.e = ((Parcelable)this.c);
      }
    }
    else
    {
      if (paramBoolean) {
        break label182;
      }
      this.e = ((Parcelable)this.c);
    }
    label181:
    return;
    label182:
    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
  }
  
  public String b()
  {
    if ((this.b == -1) && (Build.VERSION.SDK_INT >= 23)) {
      return b((Icon)this.c);
    }
    if (this.b == 2) {
      return ((String)this.c).split(":", -1)[0];
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("called getResPackage() on ");
    localStringBuilder.append(this);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public void c()
  {
    this.i = PorterDuff.Mode.valueOf(this.j);
    int k = this.b;
    label83:
    Object localObject;
    if (k != -1)
    {
      if (k != 1)
      {
        if (k != 2) {
          if (k != 3)
          {
            if (k != 4)
            {
              if (k == 5) {
                break label83;
              }
              break label143;
            }
          }
          else
          {
            this.c = this.d;
            break label143;
          }
        }
        this.c = new String(this.d, Charset.forName("UTF-16"));
        break label143;
      }
      localObject = this.e;
      if (localObject != null)
      {
        this.c = localObject;
      }
      else
      {
        localObject = this.d;
        this.c = localObject;
        this.b = 3;
        this.f = 0;
        this.g = localObject.length;
      }
    }
    else
    {
      localObject = this.e;
      if (localObject == null) {
        break label144;
      }
      this.c = localObject;
    }
    label143:
    return;
    label144:
    throw new IllegalArgumentException("Invalid icon");
  }
  
  public String toString()
  {
    if (this.b == -1) {
      return String.valueOf(this.c);
    }
    StringBuilder localStringBuilder = new StringBuilder("Icon(typ=");
    localStringBuilder.append(a(this.b));
    int k = this.b;
    if (k != 1) {
      if (k != 2)
      {
        if (k != 3)
        {
          if (k != 4)
          {
            if (k != 5) {
              break label226;
            }
          }
          else
          {
            localStringBuilder.append(" uri=");
            localStringBuilder.append(this.c);
            break label226;
          }
        }
        else
        {
          localStringBuilder.append(" len=");
          localStringBuilder.append(this.f);
          if (this.g == 0) {
            break label226;
          }
          localStringBuilder.append(" off=");
          localStringBuilder.append(this.g);
          break label226;
        }
      }
      else
      {
        localStringBuilder.append(" pkg=");
        localStringBuilder.append(b());
        localStringBuilder.append(" id=");
        localStringBuilder.append(String.format("0x%08x", new Object[] { Integer.valueOf(a()) }));
        break label226;
      }
    }
    localStringBuilder.append(" size=");
    localStringBuilder.append(((Bitmap)this.c).getWidth());
    localStringBuilder.append("x");
    localStringBuilder.append(((Bitmap)this.c).getHeight());
    label226:
    if (this.h != null)
    {
      localStringBuilder.append(" tint=");
      localStringBuilder.append(this.h);
    }
    if (this.i != a)
    {
      localStringBuilder.append(" mode=");
      localStringBuilder.append(this.i);
    }
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/graphics/drawable/IconCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */