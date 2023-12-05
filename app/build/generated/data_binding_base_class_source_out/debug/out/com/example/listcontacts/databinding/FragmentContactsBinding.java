// Generated by view binder compiler. Do not edit!
package com.example.listcontacts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.listcontacts.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentContactsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final FloatingActionButton btnAdd;

  @NonNull
  public final FloatingActionButton btnCancel;

  @NonNull
  public final MaterialButton btnChoice;

  @NonNull
  public final FloatingActionButton btnDelete;

  @NonNull
  public final MaterialCheckBox checkboxSelectAll;

  @NonNull
  public final LinearLayout llContainerBtn;

  @NonNull
  public final RecyclerView rcContacts;

  private FragmentContactsBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton btnAdd,
      @NonNull FloatingActionButton btnCancel, @NonNull MaterialButton btnChoice,
      @NonNull FloatingActionButton btnDelete, @NonNull MaterialCheckBox checkboxSelectAll,
      @NonNull LinearLayout llContainerBtn, @NonNull RecyclerView rcContacts) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.btnAdd = btnAdd;
    this.btnCancel = btnCancel;
    this.btnChoice = btnChoice;
    this.btnDelete = btnDelete;
    this.checkboxSelectAll = checkboxSelectAll;
    this.llContainerBtn = llContainerBtn;
    this.rcContacts = rcContacts;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentContactsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentContactsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_contacts, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentContactsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.btn_add;
      FloatingActionButton btnAdd = ViewBindings.findChildViewById(rootView, id);
      if (btnAdd == null) {
        break missingId;
      }

      id = R.id.btn_cancel;
      FloatingActionButton btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btn_choice;
      MaterialButton btnChoice = ViewBindings.findChildViewById(rootView, id);
      if (btnChoice == null) {
        break missingId;
      }

      id = R.id.btn_delete;
      FloatingActionButton btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.checkbox_select_all;
      MaterialCheckBox checkboxSelectAll = ViewBindings.findChildViewById(rootView, id);
      if (checkboxSelectAll == null) {
        break missingId;
      }

      id = R.id.ll_container_btn;
      LinearLayout llContainerBtn = ViewBindings.findChildViewById(rootView, id);
      if (llContainerBtn == null) {
        break missingId;
      }

      id = R.id.rc_contacts;
      RecyclerView rcContacts = ViewBindings.findChildViewById(rootView, id);
      if (rcContacts == null) {
        break missingId;
      }

      return new FragmentContactsBinding((ConstraintLayout) rootView, appBarLayout, btnAdd,
          btnCancel, btnChoice, btnDelete, checkboxSelectAll, llContainerBtn, rcContacts);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}