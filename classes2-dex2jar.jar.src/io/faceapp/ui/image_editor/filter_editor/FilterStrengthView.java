package io.faceapp.ui.image_editor.filter_editor;

import UPa;
import android.content.Context;
import android.support.v7.widget.pa;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import cWa;
import dXa;
import io.faceapp.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jta;
import mWa;
import oXa;

public final class FilterStrengthView
  extends pa
  implements jta<b>
{
  private static final b p = new b("", "a", mWa.b(new String[] { "a", "b" }));
  public static final a q = new a(null);
  public List<FilterStrengthItemView> r;
  private dXa<? super String, ? super String, cWa> s = w.b;
  private HashMap t;
  
  public FilterStrengthView(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  public FilterStrengthView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setupView(paramContext);
  }
  
  public FilterStrengthView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setupView(paramContext);
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493121, this);
    setOrientation(0);
    setHorizontalGravity(17);
    this.r = mWa.b(new FilterStrengthItemView[] { (FilterStrengthItemView)e(k.item1View), (FilterStrengthItemView)e(k.item2View), (FilterStrengthItemView)e(k.item3View), (FilterStrengthItemView)e(k.item4View) });
    if (isInEditMode()) {
      a(p);
    }
  }
  
  public final FilterStrengthView a(dXa<? super String, ? super String, cWa> paramdXa)
  {
    oXa.b(paramdXa, "changedFunc");
    this.s = paramdXa;
    return this;
  }
  
  public void a(b paramb)
  {
    oXa.b(paramb, "model");
    int i = paramb.c().indexOf(paramb.a()) + 1;
    int j = paramb.c().size();
    Object localObject1 = this.r;
    if (localObject1 != null)
    {
      localObject1 = ((Iterable)localObject1).iterator();
      int k = 0;
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = ((Iterator)localObject1).next();
        int m = k + 1;
        if (k >= 0)
        {
          localObject2 = (FilterStrengthItemView)localObject2;
          if (j >= m) {
            UPa.e((View)localObject2);
          } else {
            UPa.a((View)localObject2);
          }
          boolean bool;
          if (m == i) {
            bool = true;
          } else {
            bool = false;
          }
          ((FilterStrengthItemView)localObject2).a(m, j, bool);
          ((View)localObject2).setOnClickListener(new v(m, k, this, j, i, paramb));
          k = m;
        }
        else
        {
          mWa.c();
          throw null;
        }
      }
      return;
    }
    oXa.b("itemViews");
    throw null;
  }
  
  public View e(int paramInt)
  {
    if (this.t == null) {
      this.t = new HashMap();
    }
    View localView1 = (View)this.t.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.t.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public final List<FilterStrengthItemView> getItemViews()
  {
    List localList = this.r;
    if (localList != null) {
      return localList;
    }
    oXa.b("itemViews");
    throw null;
  }
  
  public final void setItemViews(List<FilterStrengthItemView> paramList)
  {
    oXa.b(paramList, "<set-?>");
    this.r = paramList;
  }
  
  public static final class a {}
  
  public static final class b
  {
    private final String a;
    private final String b;
    private final List<String> c;
    
    public b(String paramString1, String paramString2, List<String> paramList)
    {
      this.a = paramString1;
      this.b = paramString2;
      this.c = paramList;
    }
    
    public final String a()
    {
      return this.b;
    }
    
    public final String b()
    {
      return this.a;
    }
    
    public final List<String> c()
    {
      return this.c;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if ((oXa.a(this.a, ((b)paramObject).a)) && (oXa.a(this.b, ((b)paramObject).b)) && (oXa.a(this.c, ((b)paramObject).c))) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public int hashCode()
    {
      Object localObject = this.a;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((String)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      int k;
      if (localObject != null) {
        k = ((String)localObject).hashCode();
      } else {
        k = 0;
      }
      localObject = this.c;
      if (localObject != null) {
        i = localObject.hashCode();
      }
      return (j * 31 + k) * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Model(tag=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", selection=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", variants=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/FilterStrengthView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */