
public class trste {
	
	public static boolean update(String table, String[] fields, int numFields, String[] data, String where) {
        String sql = "update " + table + " set ";
        for (int i = 1; i < numFields; i++) {
            System.out.println(sql);
            if (i != numFields-1) {
                sql += fields[i] + "=?, ";
            } else {
                sql += fields[i] + "=?";
            }
        }
        sql += " where " + where;

        System.out.println(sql);
        return false;
        	}

	public static void main(String[] args) {
		String[] field = {"","alu_nome", "alu_data_nascimento", "alu_telefone", "alu_celular"};
        String[] data = new String[5];
        data[1] = "Renato";
        data[2] = "1997-12-23";
        data[3] = "";
        data[4] = "";

        update("aluno", field, 5, data, "id = " + 1);
        update("aluno", field, 5, data, "id = " + 1);
        
        ///renato junior teste
        
        
            
	}

}
