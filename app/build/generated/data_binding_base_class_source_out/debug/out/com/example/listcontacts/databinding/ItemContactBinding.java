// Generated by view binder compiler. Do not edit!
package com.example.listcontacts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.listcontacts.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemContactBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircleImageView imAvatarLogo;

  @NonNull
  public final TextView txtName;

  @NonNull
  public final TextView txtNumber;

  private ItemContactBinding(@NonNull ConstraintLayout rootView,
      @NonNull CircleImageView imAvatarLogo, @NonNull TextView txtName,
      @NonNull TextView txtNumber) {
    this.rootView = rootView;
    this.imAvatarLogo = imAvatarLogo;
    this.txtName = txtName;
    this.txtNumber = txtNumber;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_contact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemContactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.im_avatar_logo;
      CircleImageView imAvatarLogo = ViewBindings.findChildViewById(rootView, id);
      if (imAvatarLogo == null) {
        break missingId;
      }

      id = R.id.txt_name;
      TextView txtName = ViewBindings.findChildViewById(rootView, id);
      if (txtName == null) {
        break missingId;
      }

      id = R.id.txt_number;
      TextView txtNumber = ViewBindings.findChildViewById(rootView, id);
      if (txtNumber == null) {
        break missingId;
      }

      return new ItemContactBinding((ConstraintLayout) rootView, imAvatarLogo, txtName, txtNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
