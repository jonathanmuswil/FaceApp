import android.content.Context;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.l.a;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class ne
  extends ke
  implements l.a
{
  private Context c;
  private ActionBarContextView d;
  private ke.a e;
  private WeakReference<View> f;
  private boolean g;
  private boolean h;
  private l i;
  
  public ne(Context paramContext, ActionBarContextView paramActionBarContextView, ke.a parama, boolean paramBoolean)
  {
    this.c = paramContext;
    this.d = paramActionBarContextView;
    this.e = parama;
    paramContext = new l(paramActionBarContextView.getContext());
    paramContext.c(1);
    this.i = paramContext;
    this.i.a(this);
    this.h = paramBoolean;
  }
  
  public void a()
  {
    if (this.g) {
      return;
    }
    this.g = true;
    this.d.sendAccessibilityEvent(32);
    this.e.a(this);
  }
  
  public void a(int paramInt)
  {
    a(this.c.getString(paramInt));
  }
  
  public void a(l paraml)
  {
    i();
    this.d.d();
  }
  
  public void a(View paramView)
  {
    this.d.setCustomView(paramView);
    if (paramView != null) {
      paramView = new WeakReference(paramView);
    } else {
      paramView = null;
    }
    this.f = paramView;
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.d.setSubtitle(paramCharSequence);
  }
  
  public void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    this.d.setTitleOptional(paramBoolean);
  }
  
  public boolean a(l paraml, MenuItem paramMenuItem)
  {
    return this.e.a(this, paramMenuItem);
  }
  
  public View b()
  {
    Object localObject = this.f;
    if (localObject != null) {
      localObject = (View)((WeakReference)localObject).get();
    } else {
      localObject = null;
    }
    return (View)localObject;
  }
  
  public void b(int paramInt)
  {
    b(this.c.getString(paramInt));
  }
  
  public void b(CharSequence paramCharSequence)
  {
    this.d.setTitle(paramCharSequence);
  }
  
  public Menu c()
  {
    return this.i;
  }
  
  public MenuInflater d()
  {
    return new pe(this.d.getContext());
  }
  
  public CharSequence e()
  {
    return this.d.getSubtitle();
  }
  
  public CharSequence g()
  {
    return this.d.getTitle();
  }
  
  public void i()
  {
    this.e.b(this, this.i);
  }
  
  public boolean j()
  {
    return this.d.b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */