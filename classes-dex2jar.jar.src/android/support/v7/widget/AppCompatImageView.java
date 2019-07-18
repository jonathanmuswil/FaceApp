package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.w;
import android.support.v4.widget.E;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView
  extends ImageView
  implements w, E
{
  private final k a = new k(this);
  private final t b;
  
  public AppCompatImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AppCompatImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(mb.a(paramContext), paramAttributeSet, paramInt);
    this.a.a(paramAttributeSet, paramInt);
    this.b = new t(this);
    this.b.a(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = this.a;
    if (localObject != null) {
      ((k)localObject).a();
    }
    localObject = this.b;
    if (localObject != null) {
      ((t)localObject).a();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.a;
    if (localObject != null) {
      localObject = ((k)localObject).b();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.a;
    if (localObject != null) {
      localObject = ((k)localObject).c();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public ColorStateList getSupportImageTintList()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = ((t)localObject).b();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportImageTintMode()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = ((t)localObject).c();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public boolean hasOverlappingRendering()
  {
    boolean bool;
    if ((this.b.d()) && (super.hasOverlappingRendering())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    k localk = this.a;
    if (localk != null) {
      localk.a(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    k localk = this.a;
    if (localk != null) {
      localk.a(paramInt);
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    paramBitmap = this.b;
    if (paramBitmap != null) {
      paramBitmap.a();
    }
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    paramDrawable = this.b;
    if (paramDrawable != null) {
      paramDrawable.a();
    }
  }
  
  public void setImageResource(int paramInt)
  {
    t localt = this.b;
    if (localt != null) {
      localt.a(paramInt);
    }
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    paramUri = this.b;
    if (paramUri != null) {
      paramUri.a();
    }
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    k localk = this.a;
    if (localk != null) {
      localk.b(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    k localk = this.a;
    if (localk != null) {
      localk.a(paramMode);
    }
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    t localt = this.b;
    if (localt != null) {
      localt.a(paramColorStateList);
    }
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    t localt = this.b;
    if (localt != null) {
      localt.a(paramMode);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/AppCompatImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */