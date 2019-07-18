package io.faceapp.ui.misc.recycler.view;

import UPa;
import WVa;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bXa;
import io.faceapp.k;
import jHa;
import jHa.a;
import java.util.HashMap;
import jta;
import oXa;

public final class InPhotoErrorView
  extends ConstraintLayout
  implements jta<jHa>
{
  public static final a u = new a(null);
  private HashMap v;
  
  public InPhotoErrorView(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  public InPhotoErrorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setupView(paramContext);
  }
  
  public InPhotoErrorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setupView(paramContext);
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493118, this);
    if (isInEditMode())
    {
      a(jHa.e.a(g.b));
      setBackgroundResource(2131231100);
    }
  }
  
  public void a(jHa paramjHa)
  {
    oXa.b(paramjHa, "model");
    Object localObject = paramjHa.i();
    int i;
    if (localObject != null)
    {
      i = ((Integer)localObject).intValue();
      localObject = (TextView)c(k.title);
      oXa.a(localObject, "title");
      UPa.e((View)localObject);
      ((TextView)c(k.title)).setText(i);
    }
    else
    {
      localObject = (TextView)c(k.title);
      oXa.a(localObject, "title");
      UPa.a((View)localObject);
    }
    ((TextView)c(k.subtitle)).setText(paramjHa.g());
    paramjHa = paramjHa.e();
    if (paramjHa != null)
    {
      i = ((Number)paramjHa.a()).intValue();
      paramjHa = (bXa)paramjHa.b();
      localObject = (TextView)c(k.actionBtn);
      oXa.a(localObject, "actionBtn");
      UPa.e((View)localObject);
      ((TextView)c(k.actionBtn)).setText(i);
      localObject = (TextView)c(k.actionBtn);
      oXa.a(localObject, "actionBtn");
      ((View)localObject).setOnClickListener(new f(paramjHa));
    }
    else
    {
      paramjHa = (TextView)c(k.actionBtn);
      oXa.a(paramjHa, "actionBtn");
      UPa.a(paramjHa);
    }
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
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/InPhotoErrorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */