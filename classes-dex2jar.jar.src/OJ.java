import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public abstract class oj<Z>
  extends tj<ImageView, Z>
  implements xj.a
{
  private Animatable i;
  
  public oj(ImageView paramImageView)
  {
    super(paramImageView);
  }
  
  private void b(Z paramZ)
  {
    if ((paramZ instanceof Animatable))
    {
      this.i = ((Animatable)paramZ);
      this.i.start();
    }
    else
    {
      this.i = null;
    }
  }
  
  private void c(Z paramZ)
  {
    a(paramZ);
    b(paramZ);
  }
  
  public Drawable a()
  {
    return ((ImageView)this.d).getDrawable();
  }
  
  public void a(Drawable paramDrawable)
  {
    super.a(paramDrawable);
    c(null);
    d(paramDrawable);
  }
  
  protected abstract void a(Z paramZ);
  
  public void a(Z paramZ, xj<? super Z> paramxj)
  {
    if ((paramxj != null) && (paramxj.a(paramZ, this))) {
      b(paramZ);
    } else {
      c(paramZ);
    }
  }
  
  public void b(Drawable paramDrawable)
  {
    super.b(paramDrawable);
    c(null);
    d(paramDrawable);
  }
  
  public void c(Drawable paramDrawable)
  {
    super.c(paramDrawable);
    Animatable localAnimatable = this.i;
    if (localAnimatable != null) {
      localAnimatable.stop();
    }
    c(null);
    d(paramDrawable);
  }
  
  public void d(Drawable paramDrawable)
  {
    ((ImageView)this.d).setImageDrawable(paramDrawable);
  }
  
  public void i()
  {
    Animatable localAnimatable = this.i;
    if (localAnimatable != null) {
      localAnimatable.start();
    }
  }
  
  public void j()
  {
    Animatable localAnimatable = this.i;
    if (localAnimatable != null) {
      localAnimatable.stop();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */