package com.gevcorst.blackfyre.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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

public abstract class MainscreenBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton email;

  @NonNull
  public final ImageButton facebook;

  @NonNull
  public final ImageButton gmail;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ConstraintLayout text;

  @NonNull
  public final TextView textView;

  protected MainscreenBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton email, ImageButton facebook, ImageButton gmail, Guideline guideline2,
      ImageView imageView, ConstraintLayout text, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.email = email;
    this.facebook = facebook;
    this.gmail = gmail;
    this.guideline2 = guideline2;
    this.imageView = imageView;
    this.text = text;
    this.textView = textView;
  }

  @NonNull
  public static MainscreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.mainscreen, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainscreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainscreenBinding>inflateInternal(inflater, com.gevcorst.blackfyre.R.layout.mainscreen, root, attachToRoot, component);
  }

  @NonNull
  public static MainscreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.mainscreen, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainscreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainscreenBinding>inflateInternal(inflater, com.gevcorst.blackfyre.R.layout.mainscreen, null, false, component);
  }

  public static MainscreenBinding bind(@NonNull View view) {
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
  public static MainscreenBinding bind(@NonNull View view, @Nullable Object component) {
    return (MainscreenBinding)bind(component, view, com.gevcorst.blackfyre.R.layout.mainscreen);
  }
}
