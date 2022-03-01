package useful;
/*
import com.gbs.bank.payment.dao.interfaces.PincodeBranchMappingsDao;
import com.gbs.bank.payment.initiate.account.model.BranchInfo;
import com.gbs.bank.payment.initiate.account.model.entity.PincodeBranchMappings;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import lombok.extern.log4j.Log4j2;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Log4j2*/
public class LoadExcelController {
/*

    @Autowired
    private PincodeBranchMappingsDao pincodeBranchMappingsDao;



    @RequestMapping(value = "/import-excel", method = RequestMethod.POST)
    public ResponseEntity<List<BranchInfo>> importExcelFile(@RequestParam("file") MultipartFile files) throws IOException {
        System.out.println("load Excel service called !!! ");
        HttpStatus status = HttpStatus.OK;
        List<BranchInfo> productList = new ArrayList<>();

        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);

        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 0) {
                BranchInfo branchInfo = new BranchInfo();

                XSSFRow row = worksheet.getRow(index);


                //var cell = row.getCell(0).getStringCellValue();
                XSSFCell pincodeCell = row.getCell(0);
                XSSFCell solidCell = row.getCell(1);
                XSSFCell branchNameCell = row.getCell(2);
                XSSFCell regionCell = row.getCell(3);
                XSSFCell zoneCell = row.getCell(4);
                XSSFCell mzCell = row.getCell(5);


                String pincode = (String) getDataFromCell(pincodeCell);
                String solid = (String) getDataFromCell(solidCell);
                String branchName = (String) getDataFromCell(branchNameCell);
                String region = (String) getDataFromCell(regionCell);
                String zone = (String) getDataFromCell(zoneCell);
                String mz = (String) getDataFromCell(mzCell);

                int pin = Integer.valueOf(pincode.substring(0,6));


                PincodeBranchMappings m = new PincodeBranchMappings();
                m.setBranchId(pincode + "_" + solid);
                m.setPartnerId(1);
                m.setPincode(pin);
                m.setSolid(solid);
                m.setBranchname(branchName);
                m.setRegion(region);
                m.setZone(zone);
                m.setMz(mz);

                System.out.println(m.toString());
                //pincodeBranchMappingsDao.saveAndFlush(m);
            }
        }

        return new ResponseEntity<>(productList, status);
    }

    private static String getDataFromCell(XSSFCell cell){
        String data = "XXX";
        if(cell.getCellType()== CellType.STRING)
            data = cell.getStringCellValue();
        else if(cell.getCellType()==CellType.NUMERIC)
            data = String.valueOf(cell.getNumericCellValue());
        else if(cell.getCellType()==CellType.FORMULA)
            data = String.valueOf(cell.getCellFormula());

        return data.toString();

    }


    //////////////////////////////////////////

    @RequestMapping(value = "/import-csv", method = RequestMethod.POST)
    public ResponseEntity<List<BranchInfo>> importCsvFile(@RequestParam("file") MultipartFile files) throws IOException {
        System.out.println("load Csv service called !!! ");

        HttpStatus status = HttpStatus.OK;
        List<BranchInfo> branchInfo = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Raghu.Adapa\\OneDrive - GVC Group\\Desktop\\book.csv"))) {
            List<String[]> r = reader.readAll();

            for (String[] row : r){


                String pincode = row[0].trim().toString();
                String solid =  row[1];
                String branchName =  row[2];
                String region =  row[3];
                String zone =  row[4];
                String mz =  row[5];

                int pin = Integer.parseInt(pincode);
                String branchid = pincode + "_" + solid;

                PincodeBranchMappings m = new PincodeBranchMappings();
                m.setBranchId(branchid);
                m.setPartnerId(1);
                m.setPincode(pin);
                m.setSolid(solid);
                m.setBranchname(branchName);
                m.setRegion(region);
                m.setZone(zone);
                m.setMz(mz);


                //pincodeBranchMappingsDao.save(m);


                //PincodeBranchMappings record = pincodeBranchMappingsDao.findByBranchId(branchid);

                //List<PincodeBranchMappings> record = (List<PincodeBranchMappings>) pincodeBranchMappingsDao.findByPartnerIdAndPincode(1, pin);
            }
        } catch (CsvException e) {
            e.printStackTrace();
        }


        return new ResponseEntity<>(branchInfo, status);
    }

*/

}