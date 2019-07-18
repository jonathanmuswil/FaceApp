package io.faceapp.ui.misc.recycler.view;

import UPa;
import WVa;
import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bXa;
import io.faceapp.k;
import jHa;
import jHa.a;
import java.util.HashMap;
import jta;
import oXa;

public final class ContentErrorView
  extends ConstraintLayout
  implements jta<jHa>
{
  public static final a u = new a(null);
  private HashMap v;
  
  public ContentErrorView(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  public ContentErrorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setupView(paramContext);
  }
  
  public ContentErrorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setupView(paramContext);
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493117, this).setClickable(true);
    if (isInEditMode())
    {
      a(jHa.e.a());
      setBackgroundColor(getResources().getColor(2131099686));
    }
  }
  
  public void a(jHa paramjHa)
  {
    oXa.b(paramjHa, "model");
    ((ImageView)c(k.imageView)).setImageResource(paramjHa.f());
    Object localObject = paramjHa.i();
    int i;
    if (localObject != null)
    {
      i = ((Integer)localObject).intValue();
      localObject = (TextView)c(k.title);
      oXa.a(localObject, "title");
      UPa.e((View)localObject);
      ((TextView)c(k.title)).setText(i);
      ((TextView)c(k.title)).setTextColor(getResources().getColor(paramjHa.h()));
    }
    else
    {
      localObject = (TextView)c(k.title);
      oXa.a(localObject, "title");
      UPa.a((View)localObject);
    }
    ((TextView)c(k.subtitle)).setText(paramjHa.g());
    ((TextView)c(k.subtitle)).setTextColor(getResources().getColor(paramjHa.h()));
    localObject = paramjHa.e();
    if (localObject != null)
    {
      i = ((Number)((WVa)localObject).a()).intValue();
      localObject = (bXa)((WVa)localObject).b();
      TextView localTextView = (TextView)c(k.actionBtn);
      oXa.a(localTextView, "actionBtn");
      UPa.e(localTextView);
      ((TextView)c(k.actionBtn)).setText(i);
      localTextView = (TextView)c(k.actionBtn);
      oXa.a(localTextView, "actionBtn");
      localTextView.setOnClickListener(new c((bXa)localObject));
    }
    else
    {
      localObject = (TextView)c(k.actionBtn);
      oXa.a(localObject, "actionBtn");
      UPa.a((View)localObject);
    }
    localObject = new android.support.constraint.c();
    ((android.support.constraint.c)localObject).c(this);
    ((android.support.constraint.c)localObject).a(2131296865, paramjHa.j());
    ((android.support.constraint.c)localObject).a(this);
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
    public final ContentErrorView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = paramViewGroup.getContext();
      oXa.a(paramViewGroup, "parent.context");
      return new ContentErrorView(paramViewGroup);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/ContentErrorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */