public class Analyzer
	{
	static int totalCount;
	static int totalCountQQQ;

	public static void main(String[] args)
		{
		Data.addData();
		numberOfRecords();
		System.out.println("There are " + totalCount
				+ " records in the database.");
		numberOfQQQ();
		}

	public static int numberOfRecords()
		{
		totalCount = Data.data.size();
		return totalCount;
		}

	public static int numberOfQQQ()
		{
		for (Record x : Data.data)
			 {
			 if(x.getLetterCode().contains("qqq"));
				 {
				 numberOfQQQ()
				 }
			 }
		
		totalCountQQQ = Data.data.size();
		return totalCountQQQ;
		}

	}
