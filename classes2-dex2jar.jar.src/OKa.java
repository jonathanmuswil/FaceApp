import android.view.View;
import android.widget.TextView;
import io.faceapp.k;

final class oKa
  extends pXa
  implements bXa<cWa>
{
  oKa(iKa paramiKa)
  {
    super(0);
  }
  
  public final void b()
  {
    TextView localTextView = (TextView)this.b.e(k.actionView);
    oXa.a(localTextView, "actionView");
    localTextView.setOnClickListener(new nKa(this));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oKa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */