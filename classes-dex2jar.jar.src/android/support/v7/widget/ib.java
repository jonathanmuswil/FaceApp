package android.support.v7.widget;

import Gd;
import Ld;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.content.c;
import android.support.v4.widget.h;
import android.support.v4.widget.t;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

class ib
  extends t
  implements View.OnClickListener
{
  private final SearchManager l = (SearchManager)this.d.getSystemService("search");
  private final SearchView m;
  private final SearchableInfo n;
  private final Context o;
  private final WeakHashMap<String, Drawable.ConstantState> p;
  private final int q;
  private boolean r = false;
  private int s = 1;
  private ColorStateList t;
  private int u = -1;
  private int v = -1;
  private int w = -1;
  private int x = -1;
  private int y = -1;
  private int z = -1;
  
  public ib(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap<String, Drawable.ConstantState> paramWeakHashMap)
  {
    super(paramContext, paramSearchView.getSuggestionRowLayout(), null, true);
    this.m = paramSearchView;
    this.n = paramSearchableInfo;
    this.q = paramSearchView.getSuggestionCommitIconResId();
    this.o = paramContext;
    this.p = paramWeakHashMap;
  }
  
  private Drawable a(ComponentName paramComponentName)
  {
    Object localObject = this.d.getPackageManager();
    try
    {
      ActivityInfo localActivityInfo = ((PackageManager)localObject).getActivityInfo(paramComponentName, 128);
      int i = localActivityInfo.getIconResource();
      if (i == 0) {
        return null;
      }
      localObject = ((PackageManager)localObject).getDrawable(paramComponentName.getPackageName(), i, localActivityInfo.applicationInfo);
      if (localObject == null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invalid icon resource ");
        ((StringBuilder)localObject).append(i);
        ((StringBuilder)localObject).append(" for ");
        ((StringBuilder)localObject).append(paramComponentName.flattenToShortString());
        Log.w("SuggestionsAdapter", ((StringBuilder)localObject).toString());
        return null;
      }
      return (Drawable)localObject;
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      Log.w("SuggestionsAdapter", paramComponentName.toString());
    }
    return null;
  }
  
  private static String a(Cursor paramCursor, int paramInt)
  {
    if (paramInt == -1) {
      return null;
    }
    try
    {
      paramCursor = paramCursor.getString(paramInt);
      return paramCursor;
    }
    catch (Exception paramCursor)
    {
      Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", paramCursor);
    }
    return null;
  }
  
  public static String a(Cursor paramCursor, String paramString)
  {
    return a(paramCursor, paramCursor.getColumnIndex(paramString));
  }
  
  private void a(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null)
    {
      paramImageView.setVisibility(paramInt);
    }
    else
    {
      paramImageView.setVisibility(0);
      paramDrawable.setVisible(false, false);
      paramDrawable.setVisible(true, false);
    }
  }
  
  private void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence)) {
      paramTextView.setVisibility(8);
    } else {
      paramTextView.setVisibility(0);
    }
  }
  
  private void a(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      this.p.put(paramString, paramDrawable.getConstantState());
    }
  }
  
  private Drawable b(ComponentName paramComponentName)
  {
    String str = paramComponentName.flattenToShortString();
    boolean bool = this.p.containsKey(str);
    Object localObject = null;
    Drawable localDrawable = null;
    if (bool)
    {
      paramComponentName = (Drawable.ConstantState)this.p.get(str);
      if (paramComponentName == null) {
        paramComponentName = localDrawable;
      } else {
        paramComponentName = paramComponentName.newDrawable(this.o.getResources());
      }
      return paramComponentName;
    }
    localDrawable = a(paramComponentName);
    if (localDrawable == null) {
      paramComponentName = (ComponentName)localObject;
    } else {
      paramComponentName = localDrawable.getConstantState();
    }
    this.p.put(str, paramComponentName);
    return localDrawable;
  }
  
  private Drawable b(Uri paramUri)
  {
    try
    {
      boolean bool = "android.resource".equals(paramUri.getScheme());
      Object localObject1;
      if (bool) {
        try
        {
          Drawable localDrawable = a(paramUri);
          return localDrawable;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          localObject1 = new java/io/FileNotFoundException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("Resource does not exist: ");
          ((StringBuilder)localObject3).append(paramUri);
          ((FileNotFoundException)localObject1).<init>(((StringBuilder)localObject3).toString());
          throw ((Throwable)localObject1);
        }
      }
      Object localObject3 = this.o.getContentResolver().openInputStream(paramUri);
      if (localObject3 != null) {
        try
        {
          localObject1 = Drawable.createFromStream((InputStream)localObject3, null);
          try
          {
            ((InputStream)localObject3).close();
          }
          catch (IOException localIOException2)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((StringBuilder)localObject3).append("Error closing icon stream for ");
            ((StringBuilder)localObject3).append(paramUri);
            Log.e("SuggestionsAdapter", ((StringBuilder)localObject3).toString(), localIOException2);
          }
          return (Drawable)localObject1;
        }
        finally
        {
          try
          {
            ((InputStream)localObject3).close();
          }
          catch (IOException localIOException1)
          {
            StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
            localStringBuilder2.<init>();
            localStringBuilder2.append("Error closing icon stream for ");
            localStringBuilder2.append(paramUri);
            Log.e("SuggestionsAdapter", localStringBuilder2.toString(), localIOException1);
          }
        }
      }
      FileNotFoundException localFileNotFoundException1 = new java/io/FileNotFoundException;
      localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>();
      localStringBuilder1.append("Failed to open ");
      localStringBuilder1.append(paramUri);
      localFileNotFoundException1.<init>(localStringBuilder1.toString());
      throw localFileNotFoundException1;
    }
    catch (FileNotFoundException localFileNotFoundException2)
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("Icon not found: ");
      localStringBuilder1.append(paramUri);
      localStringBuilder1.append(", ");
      localStringBuilder1.append(localFileNotFoundException2.getMessage());
      Log.w("SuggestionsAdapter", localStringBuilder1.toString());
    }
    return null;
  }
  
  private Drawable b(String paramString)
  {
    paramString = (Drawable.ConstantState)this.p.get(paramString);
    if (paramString == null) {
      return null;
    }
    return paramString.newDrawable();
  }
  
  private CharSequence b(CharSequence paramCharSequence)
  {
    if (this.t == null)
    {
      localObject = new TypedValue();
      this.d.getTheme().resolveAttribute(Gd.textColorSearchUrl, (TypedValue)localObject, true);
      this.t = this.d.getResources().getColorStateList(((TypedValue)localObject).resourceId);
    }
    Object localObject = new SpannableString(paramCharSequence);
    ((SpannableString)localObject).setSpan(new TextAppearanceSpan(null, 0, 0, this.t, null), 0, paramCharSequence.length(), 33);
    return (CharSequence)localObject;
  }
  
  private Drawable c(Cursor paramCursor)
  {
    paramCursor = b(this.n.getSearchActivity());
    if (paramCursor != null) {
      return paramCursor;
    }
    return this.d.getPackageManager().getDefaultActivityIcon();
  }
  
  private Drawable c(String paramString)
  {
    Drawable localDrawable1 = null;
    Object localObject = localDrawable1;
    Drawable localDrawable2;
    if (paramString != null)
    {
      localObject = localDrawable1;
      if (!paramString.isEmpty()) {
        if ("0".equals(paramString)) {
          localObject = localDrawable1;
        } else {
          try
          {
            int i = Integer.parseInt(paramString);
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            ((StringBuilder)localObject).append("android.resource://");
            ((StringBuilder)localObject).append(this.o.getPackageName());
            ((StringBuilder)localObject).append("/");
            ((StringBuilder)localObject).append(i);
            localObject = ((StringBuilder)localObject).toString();
            localDrawable1 = b((String)localObject);
            if (localDrawable1 != null) {
              return localDrawable1;
            }
            localDrawable1 = c.c(this.o, i);
            a((String)localObject, localDrawable1);
            return localDrawable1;
          }
          catch (Resources.NotFoundException localNotFoundException)
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Icon resource not found: ");
            localStringBuilder.append(paramString);
            Log.w("SuggestionsAdapter", localStringBuilder.toString());
            return null;
          }
          catch (NumberFormatException localNumberFormatException)
          {
            localDrawable2 = b(paramString);
            if (localDrawable2 != null) {
              return localDrawable2;
            }
            localDrawable2 = b(Uri.parse(paramString));
            a(paramString, localDrawable2);
          }
        }
      }
    }
    return localDrawable2;
  }
  
  private Drawable d(Cursor paramCursor)
  {
    int i = this.x;
    if (i == -1) {
      return null;
    }
    Drawable localDrawable = c(paramCursor.getString(i));
    if (localDrawable != null) {
      return localDrawable;
    }
    return c(paramCursor);
  }
  
  private Drawable e(Cursor paramCursor)
  {
    int i = this.y;
    if (i == -1) {
      return null;
    }
    return c(paramCursor.getString(i));
  }
  
  private void f(Cursor paramCursor)
  {
    if (paramCursor != null) {
      paramCursor = paramCursor.getExtras();
    } else {
      paramCursor = null;
    }
    if ((paramCursor != null) && (paramCursor.getBoolean("in_progress"))) {}
  }
  
  Cursor a(SearchableInfo paramSearchableInfo, String paramString, int paramInt)
  {
    Object localObject1 = null;
    if (paramSearchableInfo == null) {
      return null;
    }
    Object localObject2 = paramSearchableInfo.getSuggestAuthority();
    if (localObject2 == null) {
      return null;
    }
    localObject2 = new Uri.Builder().scheme("content").authority((String)localObject2).query("").fragment("");
    String str = paramSearchableInfo.getSuggestPath();
    if (str != null) {
      ((Uri.Builder)localObject2).appendEncodedPath(str);
    }
    ((Uri.Builder)localObject2).appendPath("search_suggest_query");
    str = paramSearchableInfo.getSuggestSelection();
    if (str != null)
    {
      paramSearchableInfo = new String[1];
      paramSearchableInfo[0] = paramString;
    }
    else
    {
      ((Uri.Builder)localObject2).appendPath(paramString);
      paramSearchableInfo = (SearchableInfo)localObject1;
    }
    if (paramInt > 0) {
      ((Uri.Builder)localObject2).appendQueryParameter("limit", String.valueOf(paramInt));
    }
    paramString = ((Uri.Builder)localObject2).build();
    return this.d.getContentResolver().query(paramString, null, str, paramSearchableInfo, null);
  }
  
  public Cursor a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      paramCharSequence = "";
    } else {
      paramCharSequence = paramCharSequence.toString();
    }
    if ((this.m.getVisibility() == 0) && (this.m.getWindowVisibility() == 0)) {
      try
      {
        paramCharSequence = a(this.n, paramCharSequence, 50);
        if (paramCharSequence != null)
        {
          paramCharSequence.getCount();
          return paramCharSequence;
        }
      }
      catch (RuntimeException paramCharSequence)
      {
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", paramCharSequence);
      }
    }
    return null;
  }
  
  Drawable a(Uri paramUri)
    throws FileNotFoundException
  {
    String str = paramUri.getAuthority();
    if (!TextUtils.isEmpty(str)) {
      try
      {
        Resources localResources = this.d.getPackageManager().getResourcesForApplication(str);
        List localList = paramUri.getPathSegments();
        if (localList != null)
        {
          int i = localList.size();
          if (i == 1)
          {
            try
            {
              i = Integer.parseInt((String)localList.get(0));
            }
            catch (NumberFormatException localNumberFormatException)
            {
              localStringBuilder1 = new StringBuilder();
              localStringBuilder1.append("Single path segment is not a resource ID: ");
              localStringBuilder1.append(paramUri);
              throw new FileNotFoundException(localStringBuilder1.toString());
            }
          }
          else
          {
            if (i != 2) {
              break label194;
            }
            i = localResources.getIdentifier((String)localStringBuilder1.get(1), (String)localStringBuilder1.get(0), str);
          }
          if (i != 0) {
            return localResources.getDrawable(i);
          }
          localStringBuilder1 = new StringBuilder();
          localStringBuilder1.append("No resource found for: ");
          localStringBuilder1.append(paramUri);
          throw new FileNotFoundException(localStringBuilder1.toString());
          label194:
          localStringBuilder1 = new StringBuilder();
          localStringBuilder1.append("More than two path segments: ");
          localStringBuilder1.append(paramUri);
          throw new FileNotFoundException(localStringBuilder1.toString());
        }
        StringBuilder localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append("No path: ");
        localStringBuilder1.append(paramUri);
        throw new FileNotFoundException(localStringBuilder1.toString());
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("No package found for authority: ");
        localStringBuilder2.append(paramUri);
        throw new FileNotFoundException(localStringBuilder2.toString());
      }
    }
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("No authority: ");
    localStringBuilder2.append(paramUri);
    throw new FileNotFoundException(localStringBuilder2.toString());
  }
  
  public void a(int paramInt)
  {
    this.s = paramInt;
  }
  
  public void a(Cursor paramCursor)
  {
    if (this.r)
    {
      Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
      if (paramCursor != null) {
        paramCursor.close();
      }
      return;
    }
    try
    {
      super.a(paramCursor);
      if (paramCursor != null)
      {
        this.u = paramCursor.getColumnIndex("suggest_text_1");
        this.v = paramCursor.getColumnIndex("suggest_text_2");
        this.w = paramCursor.getColumnIndex("suggest_text_2_url");
        this.x = paramCursor.getColumnIndex("suggest_icon_1");
        this.y = paramCursor.getColumnIndex("suggest_icon_2");
        this.z = paramCursor.getColumnIndex("suggest_flags");
      }
    }
    catch (Exception paramCursor)
    {
      Log.e("SuggestionsAdapter", "error changing cursor and caching columns", paramCursor);
    }
  }
  
  public void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    paramContext = (a)paramView.getTag();
    int i = this.z;
    if (i != -1) {
      i = paramCursor.getInt(i);
    } else {
      i = 0;
    }
    if (paramContext.a != null)
    {
      paramView = a(paramCursor, this.u);
      a(paramContext.a, paramView);
    }
    if (paramContext.b != null)
    {
      paramView = a(paramCursor, this.w);
      if (paramView != null) {
        paramView = b(paramView);
      } else {
        paramView = a(paramCursor, this.v);
      }
      TextView localTextView;
      if (TextUtils.isEmpty(paramView))
      {
        localTextView = paramContext.a;
        if (localTextView != null)
        {
          localTextView.setSingleLine(false);
          paramContext.a.setMaxLines(2);
        }
      }
      else
      {
        localTextView = paramContext.a;
        if (localTextView != null)
        {
          localTextView.setSingleLine(true);
          paramContext.a.setMaxLines(1);
        }
      }
      a(paramContext.b, paramView);
    }
    paramView = paramContext.c;
    if (paramView != null) {
      a(paramView, d(paramCursor), 4);
    }
    paramView = paramContext.d;
    if (paramView != null) {
      a(paramView, e(paramCursor), 8);
    }
    int j = this.s;
    if ((j != 2) && ((j != 1) || ((i & 0x1) == 0)))
    {
      paramContext.e.setVisibility(8);
    }
    else
    {
      paramContext.e.setVisibility(0);
      paramContext.e.setTag(paramContext.a.getText());
      paramContext.e.setOnClickListener(this);
    }
  }
  
  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    paramContext = super.b(paramContext, paramCursor, paramViewGroup);
    paramContext.setTag(new a(paramContext));
    ((ImageView)paramContext.findViewById(Ld.edit_query)).setImageResource(this.q);
    return paramContext;
  }
  
  public CharSequence convertToString(Cursor paramCursor)
  {
    if (paramCursor == null) {
      return null;
    }
    String str = a(paramCursor, "suggest_intent_query");
    if (str != null) {
      return str;
    }
    if (this.n.shouldRewriteQueryFromData())
    {
      str = a(paramCursor, "suggest_intent_data");
      if (str != null) {
        return str;
      }
    }
    if (this.n.shouldRewriteQueryFromText())
    {
      paramCursor = a(paramCursor, "suggest_text_1");
      if (paramCursor != null) {
        return paramCursor;
      }
    }
    return null;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      paramView = super.getDropDownView(paramInt, paramView, paramViewGroup);
      return paramView;
    }
    catch (RuntimeException paramView)
    {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", paramView);
      paramViewGroup = a(this.d, this.c, paramViewGroup);
      if (paramViewGroup != null) {
        ((a)paramViewGroup.getTag()).a.setText(paramView.toString());
      }
    }
    return paramViewGroup;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      paramView = super.getView(paramInt, paramView, paramViewGroup);
      return paramView;
    }
    catch (RuntimeException paramView)
    {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", paramView);
      paramViewGroup = b(this.d, this.c, paramViewGroup);
      if (paramViewGroup != null) {
        ((a)paramViewGroup.getTag()).a.setText(paramView.toString());
      }
    }
    return paramViewGroup;
  }
  
  public boolean hasStableIds()
  {
    return false;
  }
  
  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    f(h());
  }
  
  public void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    f(h());
  }
  
  public void onClick(View paramView)
  {
    paramView = paramView.getTag();
    if ((paramView instanceof CharSequence)) {
      this.m.a((CharSequence)paramView);
    }
  }
  
  private static final class a
  {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    
    public a(View paramView)
    {
      this.a = ((TextView)paramView.findViewById(16908308));
      this.b = ((TextView)paramView.findViewById(16908309));
      this.c = ((ImageView)paramView.findViewById(16908295));
      this.d = ((ImageView)paramView.findViewById(16908296));
      this.e = ((ImageView)paramView.findViewById(Ld.edit_query));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */