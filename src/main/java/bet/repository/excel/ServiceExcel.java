package bet.repository.excel;

import bet.entity.Team;
import bet.repository.dao.TeamDAO;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ServiceExcel {
    private static TeamDAO teamDAO;
    public static void main(String[] args) throws IOException {
        teamDAO = new TeamDAO();
        List<Team> teams = teamDAO.findAllField();
        Workbook workbook = new HSSFWorkbook();
       Sheet sheet = workbook.createSheet("testBet");
       for(int i = 0; i<teams.size(); i++) {
           for(int j =0; j<teams.size(); j++) {
               Row row = sheet.createRow(j);
               Cell cell = row.createCell(i);
               cell.setCellValue(teams.get(j).toString());
           }
       }

        FileOutputStream fos = new FileOutputStream("Hockey.xls");
        workbook.write(fos);
        fos.close();
    }



}
