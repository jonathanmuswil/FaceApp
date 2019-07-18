import android.graphics.Rect;
import android.support.v4.app.V;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class tb
  extends V
{
  private static boolean a(Eb paramEb)
  {
    boolean bool;
    if ((V.a(paramEb.i())) && (V.a(paramEb.j())) && (V.a(paramEb.k()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public Object a(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    paramObject1 = (Eb)paramObject1;
    paramObject2 = (Eb)paramObject2;
    Eb localEb = (Eb)paramObject3;
    if ((paramObject1 != null) && (paramObject2 != null))
    {
      paramObject3 = new Kb();
      ((Kb)paramObject3).a((Eb)paramObject1);
      ((Kb)paramObject3).a((Eb)paramObject2);
      ((Kb)paramObject3).b(1);
      paramObject1 = paramObject3;
    }
    else if (paramObject1 == null)
    {
      if (paramObject2 != null) {
        paramObject1 = paramObject2;
      } else {
        paramObject1 = null;
      }
    }
    if (localEb != null)
    {
      paramObject2 = new Kb();
      if (paramObject1 != null) {
        ((Kb)paramObject2).a((Eb)paramObject1);
      }
      ((Kb)paramObject2).a(localEb);
      return paramObject2;
    }
    return paramObject1;
  }
  
  public void a(ViewGroup paramViewGroup, Object paramObject)
  {
    Hb.a(paramViewGroup, (Eb)paramObject);
  }
  
  public void a(Object paramObject, Rect paramRect)
  {
    if (paramObject != null) {
      ((Eb)paramObject).a(new sb(this, paramRect));
    }
  }
  
  public void a(Object paramObject, View paramView)
  {
    if (paramObject != null) {
      ((Eb)paramObject).a(paramView);
    }
  }
  
  public void a(Object paramObject, View paramView, ArrayList<View> paramArrayList)
  {
    ((Eb)paramObject).a(new qb(this, paramView, paramArrayList));
  }
  
  public void a(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3)
  {
    ((Eb)paramObject1).a(new rb(this, paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3));
  }
  
  public void a(Object paramObject, ArrayList<View> paramArrayList)
  {
    paramObject = (Eb)paramObject;
    if (paramObject == null) {
      return;
    }
    boolean bool = paramObject instanceof Kb;
    int i = 0;
    int j = 0;
    if (bool)
    {
      paramObject = (Kb)paramObject;
      i = ((Kb)paramObject).q();
      while (j < i)
      {
        a(((Kb)paramObject).a(j), paramArrayList);
        j++;
      }
    }
    if ((!a((Eb)paramObject)) && (V.a(((Eb)paramObject).m())))
    {
      int k = paramArrayList.size();
      for (j = i; j < k; j++) {
        ((Eb)paramObject).a((View)paramArrayList.get(j));
      }
    }
  }
  
  public void a(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2)
  {
    paramObject = (Eb)paramObject;
    boolean bool = paramObject instanceof Kb;
    int i = 0;
    int j = 0;
    if (bool)
    {
      paramObject = (Kb)paramObject;
      i = ((Kb)paramObject).q();
      while (j < i)
      {
        a(((Kb)paramObject).a(j), paramArrayList1, paramArrayList2);
        j++;
      }
    }
    if (!a((Eb)paramObject))
    {
      List localList = ((Eb)paramObject).m();
      if ((localList.size() == paramArrayList1.size()) && (localList.containsAll(paramArrayList1)))
      {
        if (paramArrayList2 == null) {
          j = 0;
        } else {
          j = paramArrayList2.size();
        }
        while (i < j)
        {
          ((Eb)paramObject).a((View)paramArrayList2.get(i));
          i++;
        }
        for (j = paramArrayList1.size() - 1; j >= 0; j--) {
          ((Eb)paramObject).d((View)paramArrayList1.get(j));
        }
      }
    }
  }
  
  public boolean a(Object paramObject)
  {
    return paramObject instanceof Eb;
  }
  
  public Object b(Object paramObject)
  {
    if (paramObject != null) {
      paramObject = ((Eb)paramObject).clone();
    } else {
      paramObject = null;
    }
    return paramObject;
  }
  
  public Object b(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    Kb localKb = new Kb();
    if (paramObject1 != null) {
      localKb.a((Eb)paramObject1);
    }
    if (paramObject2 != null) {
      localKb.a((Eb)paramObject2);
    }
    if (paramObject3 != null) {
      localKb.a((Eb)paramObject3);
    }
    return localKb;
  }
  
  public void b(Object paramObject, View paramView)
  {
    if (paramObject != null) {
      ((Eb)paramObject).d(paramView);
    }
  }
  
  public void b(Object paramObject, View paramView, ArrayList<View> paramArrayList)
  {
    paramObject = (Kb)paramObject;
    List localList = ((Eb)paramObject).m();
    localList.clear();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++) {
      V.a(localList, (View)paramArrayList.get(j));
    }
    localList.add(paramView);
    paramArrayList.add(paramView);
    a(paramObject, paramArrayList);
  }
  
  public void b(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2)
  {
    paramObject = (Kb)paramObject;
    if (paramObject != null)
    {
      ((Eb)paramObject).m().clear();
      ((Eb)paramObject).m().addAll(paramArrayList2);
      a(paramObject, paramArrayList1, paramArrayList2);
    }
  }
  
  public Object c(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Kb localKb = new Kb();
    localKb.a((Eb)paramObject);
    return localKb;
  }
  
  public void c(Object paramObject, View paramView)
  {
    if (paramView != null)
    {
      paramObject = (Eb)paramObject;
      Rect localRect = new Rect();
      a(paramView, localRect);
      ((Eb)paramObject).a(new pb(this, localRect));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */