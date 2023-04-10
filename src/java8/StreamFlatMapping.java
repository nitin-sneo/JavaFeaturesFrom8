package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Blog{
	private String authorName;
    private List<String> comments;
    
    
	public Blog(String authorName, List<String> comments) {
		super();
		this.authorName = authorName;
		this.comments = comments;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
    
    
}

public class StreamFlatMapping {

	public static void main(String[] args) {

		Blog blog1 = new Blog("1", Arrays.asList("Nice", "Very Nice"));
	    Blog blog2 = new Blog("2", Arrays.asList("Disappointing", "Ok", "Could be better"));
	    List<Blog> blogs = List.of(blog1, blog2);
	        
	    Map<String,  List<List<String>>> authorComments1 = blogs.stream()
	     .collect(Collectors.groupingBy(Blog::getAuthorName, 
	       Collectors.mapping(Blog::getComments, Collectors.toList())));
	       
	    System.out.println(authorComments1.size());
	    System.out.println(authorComments1.get("1").get(0).size());
	    System.out.println(authorComments1.get("2").get(0).size());

	    Map<String, Long> authorComments2 = blogs.stream()
	    	      .collect(Collectors.groupingBy(Blog::getAuthorName, 
	    	        Collectors.flatMapping(blog -> blog.getComments().stream(), 
	    	        Collectors.counting())));

	    System.out.println( authorComments2);
	    //System.out.println(authorComments2.get("1").size());
	    //System.out.println( authorComments2.get("2").size());
	}

}
