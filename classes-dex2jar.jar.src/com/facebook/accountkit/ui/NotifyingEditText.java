package com.facebook.accountkit.ui;

import android.content.Context;
import android.support.v7.widget.q;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

public final class NotifyingEditText
  extends q
{
  private View.OnKeyListener c;
  private b d;
  
  public NotifyingEditText(Context paramContext)
  {
    super(paramContext);
  }
  
  public NotifyingEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public NotifyingEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return new a(super.onCreateInputConnection(paramEditorInfo), true);
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    boolean bool = super.onTextContextMenuItem(paramInt);
    if (paramInt == 16908322)
    {
      b localb = this.d;
      if (localb != null) {
        localb.a();
      }
    }
    return bool;
  }
  
  public void setOnSoftKeyListener(View.OnKeyListener paramOnKeyListener)
  {
    this.c = paramOnKeyListener;
  }
  
  public void setPasteListener(b paramb)
  {
    this.d = paramb;
  }
  
  private class a
    extends InputConnectionWrapper
  {
    public a(InputConnection paramInputConnection, boolean paramBoolean)
    {
      super(paramBoolean);
    }
    
    public boolean deleteSurroundingText(int paramInt1, int paramInt2)
    {
      if (NotifyingEditText.a(NotifyingEditText.this) != null)
      {
        View.OnKeyListener localOnKeyListener = NotifyingEditText.a(NotifyingEditText.this);
        NotifyingEditText localNotifyingEditText = NotifyingEditText.this;
        int i = 0;
        boolean bool = localOnKeyListener.onKey(localNotifyingEditText, 67, new KeyEvent(0, 67));
        if ((NotifyingEditText.a(NotifyingEditText.this).onKey(NotifyingEditText.this, 67, new KeyEvent(1, 67))) || (bool)) {
          i = 1;
        }
        if (i != 0) {
          return true;
        }
      }
      return super.deleteSurroundingText(paramInt1, paramInt2);
    }
    
    public boolean sendKeyEvent(KeyEvent paramKeyEvent)
    {
      boolean bool;
      if (((NotifyingEditText.a(NotifyingEditText.this) != null) && (NotifyingEditText.a(NotifyingEditText.this).onKey(NotifyingEditText.this, paramKeyEvent.getKeyCode(), paramKeyEvent))) || (super.sendKeyEvent(paramKeyEvent))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/NotifyingEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */