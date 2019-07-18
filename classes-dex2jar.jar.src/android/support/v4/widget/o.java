package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

public class o
{
  public static ColorStateList a(ImageView paramImageView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramImageView.getImageTintList();
    }
    if ((paramImageView instanceof E)) {
      paramImageView = ((E)paramImageView).getSupportImageTintList();
    } else {
      paramImageView = null;
    }
    return paramImageView;
  }
  
  public static void a(ImageView paramImageView, ColorStateList paramColorStateList)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramImageView.setImageTintList(paramColorStateList);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramColorStateList = paramImageView.getDrawable();
        int i;
        if ((paramImageView.getImageTintList() != null) && (paramImageView.getImageTintMode() != null)) {
          i = 1;
        } else {
          i = 0;
        }
        if ((paramColorStateList != null) && (i != 0))
        {
          if (paramColorStateList.isStateful()) {
            paramColorStateList.setState(paramImageView.getDrawableState());
          }
          paramImageView.setImageDrawable(paramColorStateList);
        }
      }
    }
    else if ((paramImageView instanceof E))
    {
      ((E)paramImageView).setSupportImageTintList(paramColorStateList);
    }
  }
  
  public static void a(ImageView paramImageView, PorterDuff.Mode paramMode)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramImageView.setImageTintMode(paramMode);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramMode = paramImageView.getDrawable();
        int i;
        if ((paramImageView.getImageTintList() != null) && (paramImageView.getImageTintMode() != null)) {
          i = 1;
        } else {
          i = 0;
        }
        if ((paramMode != null) && (i != 0))
        {
          if (paramMode.isStateful()) {
            paramMode.setState(paramImageView.getDrawableState());
          }
          paramImageView.setImageDrawable(paramMode);
        }
      }
    }
    else if ((paramImageView instanceof E))
    {
      ((E)paramImageView).setSupportImageTintMode(paramMode);
    }
  }
  
  public static PorterDuff.Mode b(ImageView paramImageView)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramImageView.getImageTintMode();
    }
    if ((paramImageView instanceof E)) {
      paramImageView = ((E)paramImageView).getSupportImageTintMode();
    } else {
      paramImageView = null;
    }
    return paramImageView;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */