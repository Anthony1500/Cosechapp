package anthony.app.cosechapp.ui.sistema;

import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import anthony.app.cosechapp.R;

public class sistemaexperto extends Fragment {
    Button botonreglas;
    private SistemaexpertoViewModel mViewModel;

    public static sistemaexperto newInstance() {
        return new sistemaexperto();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(SistemaexpertoViewModel.class);
        View v=inflater.inflate(R.layout.sistemaexperto, container, false);
        botonreglas=(Button) v.findViewById(R.id.programarfumigacion);
        botonreglas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Fragment nuevoFragmento = new reglas_sistemaexperto();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_menuprincipal, nuevoFragmento);
                transaction.addToBackStack(null);

                // Commit a la transacción
                transaction.commit();
            }

        });

        return v;





    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(SistemaexpertoViewModel.class);
        // TODO: Use the ViewModel
    }

}