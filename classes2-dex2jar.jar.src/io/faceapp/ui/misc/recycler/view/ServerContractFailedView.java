package io.faceapp.ui.misc.recycler.view;

import UPa;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bXa;
import cWa;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;
import qHa;

public final class ServerContractFailedView
  extends ConstraintLayout
  implements jta<qHa>
{
  public static final a u = new a(null);
  private bXa<cWa> v;
  private HashMap w;
  
  public ServerContractFailedView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(qHa paramqHa)
  {
    oXa.b(paramqHa, "model");
    TextView localTextView = (TextView)c(k.subTitle);
    if (paramqHa.b()) {
      UPa.a(localTextView);
    } else {
      UPa.e(localTextView);
    }
    localTextView = (TextView)c(k.message);
    oXa.a(localTextView, "message");
    localTextView.setText(paramqHa.a());
    int i;
    if (paramqHa.b()) {
      i = 2131099853;
    } else {
      i = 2131099843;
    }
    setBackgroundResource(i);
    paramqHa = (ImageView)c(k.closeBtn);
    oXa.a(paramqHa, "closeBtn");
    paramqHa.setOnClickListener(new j(this));
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/ServerContractFailedView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */