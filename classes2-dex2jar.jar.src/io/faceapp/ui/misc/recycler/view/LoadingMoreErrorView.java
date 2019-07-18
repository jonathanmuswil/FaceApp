package io.faceapp.ui.misc.recycler.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import bXa;
import cWa;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import lHa;
import oXa;

public final class LoadingMoreErrorView
  extends ConstraintLayout
  implements jta<lHa>
{
  public static final a u = new a(null);
  private bXa<cWa> v;
  private HashMap w;
  
  public LoadingMoreErrorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(lHa paramlHa)
  {
    oXa.b(paramlHa, "model");
    paramlHa = (Button)c(k.retryButton);
    oXa.a(paramlHa, "retryButton");
    paramlHa.setOnClickListener(new h(this));
  }
  
  public View c(int paramInt)
  {
    if (this.w == null) {
      this.w = new HashMap();
    }
    View localView1 = (View)this.w.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.w.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/LoadingMoreErrorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */