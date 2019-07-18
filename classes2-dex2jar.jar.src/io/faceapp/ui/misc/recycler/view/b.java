package io.faceapp.ui.misc.recycler.view;

import UPa;
import WVa;
import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bXa;
import iHa;
import iHa.a;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;

public final class b
  extends ConstraintLayout
  implements jta<iHa>
{
  public static final a u = new a(null);
  private HashMap v;
  
  public b(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493116, this).setClickable(true);
    if (isInEditMode())
    {
      a(iHa.a.a(2131689630));
      setBackgroundColor(getResources().getColor(2131099686));
    }
  }
  
  public void a(iHa paramiHa)
  {
    oXa.b(paramiHa, "model");
    ((ImageView)c(k.imageView)).setImageResource(paramiHa.b());
    ((TextView)c(k.labelView)).setText(paramiHa.c());
    ((TextView)c(k.labelView)).setTextColor(getResources().getColor(paramiHa.d()));
    Object localObject = paramiHa.a();
    if (localObject != null)
    {
      int i = ((Number)((WVa)localObject).a()).intValue();
      localObject = (bXa)((WVa)localObject).b();
      TextView localTextView = (TextView)c(k.actionBtn);
      oXa.a(localTextView, "actionBtn");
      UPa.e(localTextView);
      ((TextView)c(k.actionBtn)).setText(i);
      localTextView = (TextView)c(k.actionBtn);
      oXa.a(localTextView, "actionBtn");
      localTextView.setOnClickListener(new a((bXa)localObject));
    }
    else
    {
      localObject = (TextView)c(k.actionBtn);
      oXa.a(localObject, "actionBtn");
      UPa.a((View)localObject);
    }
    localObject = new c();
    ((c)localObject).c(this);
    ((c)localObject).a(2131296865, paramiHa.e());
    ((c)localObject).a(this);
  }
  
  public View c(int paramInt)
  {
    if (this.v == null) {
      this.v = new HashMap();
    }
    View localView1 = (View)this.v.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.v.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    public final b a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = paramViewGroup.getContext();
      oXa.a(paramViewGroup, "parent.context");
      return new b(paramViewGroup);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */