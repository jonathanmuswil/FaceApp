import android.content.Context;
import android.view.View;
import android.widget.TextView;
import io.faceapp.m;

public final class oLa
  extends jLa<nLa, mLa>
  implements nLa
{
  private final cXa<m, cWa> d;
  private final int e;
  
  public oLa(Context paramContext, cXa<? super m, cWa> paramcXa, int paramInt)
  {
    super(paramContext, 2131493102);
    this.d = paramcXa;
    this.e = paramInt;
  }
  
  public mLa b()
  {
    return new mLa(this.d);
  }
  
  public final cXa<m, cWa> getOnClick()
  {
    return this.d;
  }
  
  public final int getTitleRes()
  {
    return this.e;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    View localView = findViewById(2131296932);
    if (localView != null)
    {
      ((TextView)localView).setText(this.e);
      return;
    }
    oXa.a();
    throw null;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oLa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */