package com.gevcorst.blackfyre.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ProfileBinding extends ViewDataBinding {
  @NonNull
  public final TextView editText;

  @NonNull
  public final Guideline guideline1;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ConstraintLayout linearLayout;

  protected ProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView editText, Guideline guideline1, Guideline guideline2, ImageView imageView2,
      ImageView imageView4, ConstraintLayout linearLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.editText = editText;
    this.guideline1 = guideline1;
    this.guideline2 = guideline2;
    this.imageView2 = imageView2;
    this.imageView4 = imageView4;
    this.linearLayout = linearLayout;
  }

  @NonNull
  public static ProfileBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ProfileBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ProfileBinding>inflateInternal(inflater, com.gevcorst.blackfyre.R.layout.profile, root, attachToRoot, component);
  }

  @NonNull
  public static ProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ProfileBinding>inflateInternal(inflater, com.gevcorst.blackfyre.R.layout.profile, null, false, component);
  }

  public static ProfileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (ProfileBinding)bind(component, view, com.gevcorst.blackfyre.R.layout.profile);
  }
}