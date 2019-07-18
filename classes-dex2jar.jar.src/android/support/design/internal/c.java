package android.support.design.internal;

import W;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.pb;
import android.util.AttributeSet;
import fa;

public final class c
{
  private static final int[] a = { W.colorPrimary };
  private static final int[] b = { W.colorSecondary };
  
  public static TypedArray a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt1, int paramInt1, int paramInt2, int... paramVarArgs)
  {
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    c(paramContext, paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2, paramVarArgs);
    return paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2);
  }
  
  public static void a(Context paramContext)
  {
    a(paramContext, a, "Theme.AppCompat");
  }
  
  private static void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, fa.ThemeEnforcement, paramInt1, paramInt2);
    boolean bool = paramAttributeSet.getBoolean(fa.ThemeEnforcement_enforceMaterialTheme, false);
    paramAttributeSet.recycle();
    if (bool) {
      b(paramContext);
    }
    a(paramContext);
  }
  
  private static void a(Context paramContext, int[] paramArrayOfInt, String paramString)
  {
    if (a(paramContext, paramArrayOfInt)) {
      return;
    }
    paramContext = new StringBuilder();
    paramContext.append("The style on this component requires your app theme to be ");
    paramContext.append(paramString);
    paramContext.append(" (or a descendant).");
    throw new IllegalArgumentException(paramContext.toString());
  }
  
  private static boolean a(Context paramContext, int[] paramArrayOfInt)
  {
    paramContext = paramContext.obtainStyledAttributes(paramArrayOfInt);
    boolean bool = paramContext.hasValue(0);
    paramContext.recycle();
    return bool;
  }
  
  public static pb b(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt1, int paramInt1, int paramInt2, int... paramVarArgs)
  {
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    c(paramContext, paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2, paramVarArgs);
    return pb.a(paramContext, paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2);
  }
  
  public static void b(Context paramContext)
  {
    a(paramContext, b, "Theme.MaterialComponents");
  }
  
  private static void c(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt1, int paramInt1, int paramInt2, int... paramVarArgs)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fa.ThemeEnforcement, paramInt1, paramInt2);
    if (!localTypedArray.getBoolean(fa.ThemeEnforcement_enforceTextAppearance, false))
    {
      localTypedArray.recycle();
      return;
    }
    boolean bool;
    if ((paramVarArgs != null) && (paramVarArgs.length != 0)) {
      bool = d(paramContext, paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2, paramVarArgs);
    } else if (localTypedArray.getResourceId(fa.ThemeEnforcement_android_textAppearance, -1) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    localTypedArray.recycle();
    if (bool) {
      return;
    }
    throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
  }
  
  private static boolean d(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt1, int paramInt1, int paramInt2, int... paramVarArgs)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2);
    paramInt2 = paramVarArgs.length;
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      if (paramContext.getResourceId(paramVarArgs[paramInt1], -1) == -1)
      {
        paramContext.recycle();
        return false;
      }
    }
    paramContext.recycle();
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */