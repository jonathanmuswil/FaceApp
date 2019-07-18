import android.graphics.PointF;
import android.view.View;

class mb$a
{
  private int a;
  private int b;
  private int c;
  private int d;
  private View e;
  private int f;
  private int g;
  
  mb$a(View paramView)
  {
    this.e = paramView;
  }
  
  private void a()
  {
    _b.a(this.e, this.a, this.b, this.c, this.d);
    this.f = 0;
    this.g = 0;
  }
  
  void a(PointF paramPointF)
  {
    this.c = Math.round(paramPointF.x);
    this.d = Math.round(paramPointF.y);
    this.g += 1;
    if (this.f == this.g) {
      a();
    }
  }
  
  void b(PointF paramPointF)
  {
    this.a = Math.round(paramPointF.x);
    this.b = Math.round(paramPointF.y);
    this.f += 1;
    if (this.f == this.g) {
      a();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */