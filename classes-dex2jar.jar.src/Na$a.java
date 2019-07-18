import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import java.util.ArrayList;

class Na$a
  extends Drawable.ConstantState
{
  int a;
  Ua b;
  AnimatorSet c;
  ArrayList<Animator> d;
  gd<Animator, String> e;
  
  public Na$a(Context paramContext, a parama, Drawable.Callback paramCallback, Resources paramResources)
  {
    if (parama != null)
    {
      this.a = parama.a;
      paramContext = parama.b;
      int i = 0;
      if (paramContext != null)
      {
        paramContext = paramContext.getConstantState();
        if (paramResources != null) {
          this.b = ((Ua)paramContext.newDrawable(paramResources));
        } else {
          this.b = ((Ua)paramContext.newDrawable());
        }
        paramContext = this.b;
        paramContext.mutate();
        this.b = ((Ua)paramContext);
        this.b.setCallback(paramCallback);
        this.b.setBounds(parama.b.getBounds());
        this.b.a(false);
      }
      paramContext = parama.d;
      if (paramContext != null)
      {
        int j = paramContext.size();
        this.d = new ArrayList(j);
        this.e = new gd(j);
        while (i < j)
        {
          paramCallback = (Animator)parama.d.get(i);
          paramContext = paramCallback.clone();
          paramCallback = (String)parama.e.get(paramCallback);
          paramContext.setTarget(this.b.a(paramCallback));
          this.d.add(paramContext);
          this.e.put(paramContext, paramCallback);
          i++;
        }
        a();
      }
    }
  }
  
  public void a()
  {
    if (this.c == null) {
      this.c = new AnimatorSet();
    }
    this.c.playTogether(this.d);
  }
  
  public int getChangingConfigurations()
  {
    return this.a;
  }
  
  public Drawable newDrawable()
  {
    throw new IllegalStateException("No constant state support for SDK < 24.");
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    throw new IllegalStateException("No constant state support for SDK < 24.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Na$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */