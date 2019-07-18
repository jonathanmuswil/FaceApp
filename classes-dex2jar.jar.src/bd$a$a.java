import android.os.Build.VERSION;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

public class bd$a$a
{
  private final TextPaint a;
  private TextDirectionHeuristic b;
  private int c;
  private int d;
  
  public bd$a$a(TextPaint paramTextPaint)
  {
    this.a = paramTextPaint;
    if (Build.VERSION.SDK_INT >= 23)
    {
      this.c = 1;
      this.d = 1;
    }
    else
    {
      this.d = 0;
      this.c = 0;
    }
    if (Build.VERSION.SDK_INT >= 18) {
      this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    } else {
      this.b = null;
    }
  }
  
  public a a(int paramInt)
  {
    this.c = paramInt;
    return this;
  }
  
  public a a(TextDirectionHeuristic paramTextDirectionHeuristic)
  {
    this.b = paramTextDirectionHeuristic;
    return this;
  }
  
  public bd.a a()
  {
    return new bd.a(this.a, this.b, this.c, this.d);
  }
  
  public a b(int paramInt)
  {
    this.d = paramInt;
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bd$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */