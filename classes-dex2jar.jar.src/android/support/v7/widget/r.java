package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

class r
{
  static InputConnection a(InputConnection paramInputConnection, EditorInfo paramEditorInfo, View paramView)
  {
    if ((paramInputConnection != null) && (paramEditorInfo.hintText == null)) {
      for (paramView = paramView.getParent(); (paramView instanceof View); paramView = paramView.getParent()) {
        if ((paramView instanceof Gb))
        {
          paramEditorInfo.hintText = ((Gb)paramView).a();
          break;
        }
      }
    }
    return paramInputConnection;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */