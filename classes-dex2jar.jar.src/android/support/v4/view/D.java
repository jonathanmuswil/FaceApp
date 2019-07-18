package android.support.v4.view;

import Ad;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import zd;

public class d
{
  private static final View.AccessibilityDelegate a = new View.AccessibilityDelegate();
  private final View.AccessibilityDelegate b = new a(this);
  
  public Ad a(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramView = a.getAccessibilityNodeProvider(paramView);
      if (paramView != null) {
        return new Ad(paramView);
      }
    }
    return null;
  }
  
  View.AccessibilityDelegate a()
  {
    return this.b;
  }
  
  public void a(View paramView, int paramInt)
  {
    a.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void a(View paramView, zd paramzd)
  {
    a.onInitializeAccessibilityNodeInfo(paramView, paramzd.u());
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return a.performAccessibilityAction(paramView, paramInt, paramBundle);
    }
    return false;
  }
  
  public boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return a.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
  
  private static final class a
    extends View.AccessibilityDelegate
  {
    private final d a;
    
    a(d paramd)
    {
      this.a = paramd;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return this.a.a(paramView, paramAccessibilityEvent);
    }
    
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
    {
      paramView = this.a.a(paramView);
      if (paramView != null) {
        paramView = (AccessibilityNodeProvider)paramView.a();
      } else {
        paramView = null;
      }
      return paramView;
    }
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      this.a.b(paramView, paramAccessibilityEvent);
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      this.a.a(paramView, zd.a(paramAccessibilityNodeInfo));
    }
    
    public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      this.a.c(paramView, paramAccessibilityEvent);
    }
    
    public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return this.a.a(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    
    public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      return this.a.a(paramView, paramInt, paramBundle);
    }
    
    public void sendAccessibilityEvent(View paramView, int paramInt)
    {
      this.a.a(paramView, paramInt);
    }
    
    public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      this.a.d(paramView, paramAccessibilityEvent);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */