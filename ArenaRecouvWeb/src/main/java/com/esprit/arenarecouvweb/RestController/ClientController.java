package com.esprit.arenarecouvweb.RestController;

import com.esprit.arenarecouvweb.Entity.Action;
import com.esprit.arenarecouvweb.Entity.Client;
import com.esprit.arenarecouvweb.Entity.Nomenclature;
import com.esprit.arenarecouvweb.Repository.nomenDao;
import com.esprit.arenarecouvweb.Services.ActionService;
import com.esprit.arenarecouvweb.Services.ClientService;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@RestController

@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;
    @Autowired
    ActionService actionService;
    @Autowired
    nomenDao nomenDao;
   // CsvExportService csvExportService;

    @GetMapping("/getClientByid/{idClient}")
    public Client getClient(@PathVariable String idClient) {
        return clientService.getClient(idClient);
    }
    @GetMapping("/getAll")
    public List<Client> getallClient() {
        return clientService.getClients();
    }

   /* @GetMapping("/getClientInfo/{idClient}")
    public info getClientInfo(@PathVariable String idClient) {
        return clientService.getClientInfo(idClient);
    }
*/

    @GetMapping("/getClientHistorique/{idClient}")
    public List<Action> getClientHistorique(@PathVariable String idClient) {
        return actionService.returnActionsByIdClient(idClient);
    }

    @GetMapping("/allAction")
    public List<Action> getActions() {
        return actionService.allAction();
    }

    @GetMapping("/getNomen/{idNom}")
    public Nomenclature getNomen(@PathVariable String idNom) {
        return nomenDao.getNomenclatureByIdNom(idNom);
    }

    @GetMapping("/download")
    public void getAllEmployeesInCsv(HttpServletResponse servletResponse) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintWriter writer = new PrintWriter(outputStream);

        // Write the CSV content to the ByteArrayOutputStream
       // csvExportService.writeEmployeesToCsv(writer);
      //  writer.flush();

        // Set the response headers for CSV download
        servletResponse.setContentType("text/csv");
        servletResponse.setHeader("Content-Disposition", "attachment; filename=\"actions.csv\"");

        // Write the ByteArrayOutputStream to the response OutputStream
        ServletOutputStream responseOutputStream = servletResponse.getOutputStream();
        outputStream.writeTo(responseOutputStream);
        outputStream.flush();
        responseOutputStream.flush();
        responseOutputStream.close();
    }

    @GetMapping("/getAllNomen")
    public List<Nomenclature> getAllNomen() {
        return nomenDao.findAll();
    }

}
