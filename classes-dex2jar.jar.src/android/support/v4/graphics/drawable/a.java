package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class a
{
  private static Method a;
  private static boolean b;
  private static Method c;
  private static boolean d;
  
  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.setHotspot(paramFloat1, paramFloat2);
    }
  }
  
  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.setTintList(paramColorStateList);
    } else if ((paramDrawable instanceof b)) {
      ((b)paramDrawable).setTintList(paramColorStateList);
    }
  }
  
  public static void a(Drawable paramDrawable, Resources.Theme paramTheme)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.applyTheme(paramTheme);
    }
  }
  
  public static void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    } else {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
    }
  }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.setTintMode(paramMode);
    } else if ((paramDrawable instanceof b)) {
      ((b)paramDrawable).setTintMode(paramMode);
    }
  }
  
  public static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramDrawable.setAutoMirrored(paramBoolean);
    }
  }
  
  public static boolean a(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramDrawable.canApplyTheme();
    }
    return false;
  }
  
  public static boolean a(Drawable paramDrawable, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      return paramDrawable.setLayoutDirection(paramInt);
    }
    if (i >= 17)
    {
      if (!b)
      {
        try
        {
          Class localClass = Integer.TYPE;
          a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[] { localClass });
          a.setAccessible(true);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", localNoSuchMethodException);
        }
        b = true;
      }
      Method localMethod = a;
      if (localMethod != null) {
        try
        {
          localMethod.invoke(paramDrawable, new Object[] { Integer.valueOf(paramInt) });
          return true;
        }
        catch (Exception paramDrawable)
        {
          Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", paramDrawable);
          a = null;
        }
      }
    }
    return false;
  }
  
  public static void b(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      paramDrawable.clearColorFilter();
    }
    else if (i >= 21)
    {
      paramDrawable.clearColorFilter();
      if ((paramDrawable instanceof InsetDrawable))
      {
        b(((InsetDrawable)paramDrawable).getDrawable());
      }
      else if ((paramDrawable instanceof c))
      {
        b(((c)paramDrawable).a());
      }
      else if ((paramDrawable instanceof DrawableContainer))
      {
        paramDrawable = (DrawableContainer.DrawableContainerState)((DrawableContainer)paramDrawable).getConstantState();
        if (paramDrawable != null)
        {
          i = 0;
          int j = paramDrawable.getChildCount();
          while (i < j)
          {
            Drawable localDrawable = paramDrawable.getChild(i);
            if (localDrawable != null) {
              b(localDrawable);
            }
            i++;
          }
        }
      }
    }
    else
    {
      paramDrawable.clearColorFilter();
    }
  }
  
  public static void b(Drawable paramDrawable, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramDrawable.setTint(paramInt);
    } else if ((paramDrawable instanceof b)) {
      ((b)paramDrawable).setTint(paramInt);
    }
  }
  
  public static int c(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramDrawable.getAlpha();
    }
    return 0;
  }
  
  public static ColorFilter d(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramDrawable.getColorFilter();
    }
    return null;
  }
  
  public static int e(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      return paramDrawable.getLayoutDirection();
    }
    if (i >= 17)
    {
      if (!d)
      {
        try
        {
          c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
          c.setAccessible(true);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", localNoSuchMethodException);
        }
        d = true;
      }
      Method localMethod = c;
      if (localMethod != null) {
        try
        {
          i = ((Integer)localMethod.invoke(paramDrawable, new Object[0])).intValue();
          return i;
        }
        catch (Exception paramDrawable)
        {
          Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", paramDrawable);
          c = null;
        }
      }
    }
    return 0;
  }
  
  public static boolean f(Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramDrawable.isAutoMirrored();
    }
    return false;
  }
  
  @Deprecated
  public static void g(Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }
  
  public static <T extends Drawable> T h(Drawable paramDrawable)
  {
    Drawable localDrawable = paramDrawable;
    if ((paramDrawable instanceof c)) {
      localDrawable = ((c)paramDrawable).a();
    }
    return localDrawable;
  }
  
  public static Drawable i(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      return paramDrawable;
    }
    if (i >= 21)
    {
      if (!(paramDrawable instanceof b)) {
        return new e(paramDrawable);
      }
      return paramDrawable;
    }
    if (!(paramDrawable instanceof b)) {
      return new d(paramDrawable);
    }
    return paramDrawable;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/graphics/drawable/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */