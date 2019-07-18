import android.graphics.drawable.Drawable;

final class ai
  extends Zh<Drawable>
{
  private ai(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  static Wf<Drawable> a(Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      paramDrawable = new ai(paramDrawable);
    } else {
      paramDrawable = null;
    }
    return paramDrawable;
  }
  
  public void a() {}
  
  public int b()
  {
    return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
  }
  
  public Class<Drawable> c()
  {
    return this.a.getClass();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */