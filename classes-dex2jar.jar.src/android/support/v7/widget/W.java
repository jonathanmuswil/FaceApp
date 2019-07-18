package android.support.v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.graphics.drawable.c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class w
{
  private static final int[] a = { 16843067, 16843068 };
  private final ProgressBar b;
  private Bitmap c;
  
  w(ProgressBar paramProgressBar)
  {
    this.b = paramProgressBar;
  }
  
  private Drawable a(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if ((paramDrawable instanceof AnimationDrawable))
    {
      AnimationDrawable localAnimationDrawable = (AnimationDrawable)paramDrawable;
      int i = localAnimationDrawable.getNumberOfFrames();
      localObject = new AnimationDrawable();
      ((AnimationDrawable)localObject).setOneShot(localAnimationDrawable.isOneShot());
      for (int j = 0; j < i; j++)
      {
        paramDrawable = a(localAnimationDrawable.getFrame(j), true);
        paramDrawable.setLevel(10000);
        ((AnimationDrawable)localObject).addFrame(paramDrawable, localAnimationDrawable.getDuration(j));
      }
      ((AnimationDrawable)localObject).setLevel(10000);
    }
    return (Drawable)localObject;
  }
  
  private Drawable a(Drawable paramDrawable, boolean paramBoolean)
  {
    Object localObject1;
    Object localObject2;
    if ((paramDrawable instanceof c))
    {
      c localc = (c)paramDrawable;
      localObject1 = localc.a();
      localObject2 = paramDrawable;
      if (localObject1 != null)
      {
        localc.a(a((Drawable)localObject1, paramBoolean));
        localObject2 = paramDrawable;
      }
    }
    else
    {
      if ((paramDrawable instanceof LayerDrawable))
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        int i = paramDrawable.getNumberOfLayers();
        localObject1 = new Drawable[i];
        int j = 0;
        for (int k = 0; k < i; k++)
        {
          int m = paramDrawable.getId(k);
          localObject2 = paramDrawable.getDrawable(k);
          if ((m != 16908301) && (m != 16908303)) {
            paramBoolean = false;
          } else {
            paramBoolean = true;
          }
          localObject1[k] = a((Drawable)localObject2, paramBoolean);
        }
        localObject2 = new LayerDrawable((Drawable[])localObject1);
        for (k = j; k < i; k++) {
          ((LayerDrawable)localObject2).setId(k, paramDrawable.getId(k));
        }
        return (Drawable)localObject2;
      }
      localObject2 = paramDrawable;
      if ((paramDrawable instanceof BitmapDrawable))
      {
        paramDrawable = (BitmapDrawable)paramDrawable;
        localObject1 = paramDrawable.getBitmap();
        if (this.c == null) {
          this.c = ((Bitmap)localObject1);
        }
        localObject2 = new ShapeDrawable(b());
        localObject1 = new BitmapShader((Bitmap)localObject1, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        ((ShapeDrawable)localObject2).getPaint().setShader((Shader)localObject1);
        ((ShapeDrawable)localObject2).getPaint().setColorFilter(paramDrawable.getPaint().getColorFilter());
        if (paramBoolean) {
          localObject2 = new ClipDrawable((Drawable)localObject2, 3, 1);
        }
      }
    }
    return (Drawable)localObject2;
  }
  
  private Shape b()
  {
    return new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null);
  }
  
  Bitmap a()
  {
    return this.c;
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = pb.a(this.b.getContext(), paramAttributeSet, a, paramInt, 0);
    Drawable localDrawable = paramAttributeSet.c(0);
    if (localDrawable != null) {
      this.b.setIndeterminateDrawable(a(localDrawable));
    }
    localDrawable = paramAttributeSet.c(1);
    if (localDrawable != null) {
      this.b.setProgressDrawable(a(localDrawable, false));
    }
    paramAttributeSet.a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */