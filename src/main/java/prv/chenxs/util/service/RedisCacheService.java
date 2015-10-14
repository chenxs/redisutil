package prv.chenxs.util.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import prv.chenxs.util.exception.CaseErrorException;

public interface RedisCacheService {

		/**
		 * 璁剧疆key-value澶辨晥鏃堕棿锛屽瓧绗︿覆绫诲瀷key
		 * 
		 * @param key
		 * @param seconds
		 * @return
		 */
		public long expireString(String key, int seconds) ;
		/**
		 * 璁剧疆key-value澶辨晥鏃堕棿锛屽瓧绗︿覆绫诲瀷key
		 * 
		 * @param key
		 * @param seconds
		 * @return
		 */
		public <K> long expire(K key, int seconds) ;
		/**
		 * 妫�煡key鏄惁瀛樺湪缂撳瓨
		 * 
		 * @param key
		 * @return
		 */
		public <K> boolean checkKeyExisted(K key) ;

		/**
		 * 鍔�鎿嶄綔
		 * 
		 * @param key
		 * @return 杩斿洖鎿嶄綔鍚庣殑鍊�		 */
		public long increase(String key) ;

		/**
		 * 鍔犳搷浣滐紝鎸囧畾鍔犵殑閲�		 * 
		 * @param key
		 * @param num
		 * @return 杩斿洖鎿嶄綔鍚庣殑鍊�		 */
		public long increase(String key, int num) ;


		/**
		 * 鍑�鎿嶄綔
		 * 
		 * @param key
		 * @return 杩斿洖鎿嶄綔鍚庣殑鍊�		 */
		public long decrease(String key) ;

		/**
		 * 鍑忔搷浣滐紝鎸囧畾鍑忕殑鍊�		 * 
		 * @param key
		 * @param num
		 * @return 杩斿洖鎿嶄綔鍚庣殑鍊�		 */
		public long decrease(String key, int num) ;

		/**
		 * 鍒犻櫎缂撳瓨璁板綍锛屽厛鍋氬瓧绗︿覆鍒ゆ柇锛屼笉瀛樺湪鍐嶅key鍋氬簭鍒楀寲澶勭悊
		 * 
		 * @param key
		 */
		public long delete(String key) ;

		/**
		 * 鍒犻櫎缂撳瓨璁板綍锛岀洿鎺ュkey鍋氬簭鍒楀寲澶勭悊
		 * 
		 * @param key
		 * @return
		 */
		public <K> long deleteObjectKey(K key);

		/**
		 * 璁剧疆瀵硅薄绫诲瀷缂撳瓨椤癸紝鏃犲け鏁堟椂闂�		 * 
		 * @param key
		 * @param value
		 */
		public <K,V> boolean set(K key, V value) ;
		/**
		 * 璁剧疆瀵硅薄绫诲瀷缂撳瓨椤癸紝鍔犲叆澶辨晥鏃堕棿锛屽崟浣嶄负绉�		 * 
		 * @param key
		 * @param value
		 * @param exp
		 */
		public <K,V> boolean set(K key, V value, int exp);

		/**
		 * 鑾峰彇瀵硅薄绫诲瀷
		 * 
		 * @param key
		 * @return
		 */
		public <K>Object get(K key) ;
		
		/**
		 * 鑾峰彇瀵硅薄绫诲瀷
		 * 
		 * @param key
		 * @return
		 */
		public <K,V>V get(K key,Class<V> valueType) throws CaseErrorException;


		/**
		 * 璁剧疆瀛楃涓茬被鍨嬬紦瀛橀」
		 * 
		 * @param key
		 * @param value
		 */
		public void setString(String key, String value);

		/**
		 * 瀛樺偍瀛楃涓茬被鍨嬬紦瀛橀」锛屽姞鍏ュけ鏁堟椂闂达紝鍗曚綅涓虹
		 * 
		 * @param key
		 * @param value
		 * @param exp
		 */
		public void setString(String key, String value, int exp) ;

		/**
		 * 鑾峰彇瀛楃涓茬被鍨�		 * 
		 * @param key
		 * @return
		 */
		public String getString(String key);

		/**
		 * 鑾峰彇鎵�湁鍒楄〃(榛樿浠庡乏杈圭涓�釜寮�)
		 * 
		 * @param listKey
		 * @return
		 */
		public <K> List<Object> getListAll(K listKey);
		/**
		 * 鑾峰彇鎵�湁鍒楄〃(榛樿浠庡乏杈圭涓�釜寮�)
		 * 
		 * @param listKey
		 * @return
		 */
		public <K,V> List<V> getListAll(K listKey,Class<V> valueType)throws CaseErrorException;
		
		/**
		 * 鑾峰彇鎵�湁鍒楄〃(榛樿浠庡乏杈圭涓�釜寮�)
		 * 
		 * @param listKey
		 * @return
		 */
		public List<Object> getStringListAll(String listKey);
		/**
		 * 鑾峰彇鎵�湁鍒楄〃(榛樿浠庡乏杈圭涓�釜寮�)
		 * 
		 * @param listKey
		 * @return
		 */
		public <V> List<V> getStringListAll(String listKey,Class<V> valueType)throws CaseErrorException;
		
		/**
		 * 浠庡乏杈规坊鍔犲埌list
		 * 
		 * @param listKey
		 * @param value
		 */
		public <V> void addToStringListLeft(String listKey, V value);
		
		/**
		 * 浠庡乏杈规坊鍔犲埌list
		 * 
		 * @param listKey
		 * @param value
		 */
		public <K,V> void addToListLeft(K listKey, V value);

		/**
		 * 浠庡彸杈规坊鍔犲埌list
		 * 
		 * @param listKey
		 * @param value
		 */
		public <V> void addToStringListRight(String listKey, V value) ;

		/**
		 * 浠庡彸杈规坊鍔犲埌list
		 * 
		 * @param listKey
		 * @param value
		 */
		public <K,V> void addToListRight(K listKey, V value) ;

		/**
		 * 浠庡乏杈圭Щ闄や竴涓璞★紝骞惰繑鍥炶瀵硅薄
		 * 
		 * @param listKey
		 * @return
		 */
		public Object popFromStringListLeft(String listKey) ;
		
		/**
		 * 浠庡乏杈圭Щ闄や竴涓璞★紝骞惰繑鍥炶瀵硅薄
		 * 
		 * @param listKey
		 * @return
		 */
		public <V>V popFromStringListLeft(String listKey,Class<V> valueType) throws CaseErrorException;

		/**
		 * 浠庡乏杈圭Щ闄や竴涓璞★紝骞惰繑鍥炶瀵硅薄
		 * 
		 * @param listKey
		 * @return
		 */
		public <K> Object popFromListLeft(K listKey);
		
		/**
		 * 浠庡乏杈圭Щ闄や竴涓璞★紝骞惰繑鍥炶瀵硅薄
		 * 
		 * @param listKey
		 * @return
		 */
		public <K,V> V popFromListLeft(K listKey,Class<V> valueType)throws CaseErrorException;

		
		/**
		 * 浠庡彸杈圭Щ闄や竴涓璞★紝骞惰繑鍥炶瀵硅薄
		 * 
		 * @param listKey
		 * @return
		 */
		public Object popFromStringListRight(String listKey) ;
		
		/**
		 * 浠庡彸杈圭Щ闄や竴涓璞★紝骞惰繑鍥炶瀵硅薄
		 * 
		 * @param listKey
		 * @return
		 */
		public <V>V popFromStringListRight(String listKey,Class<V> valueType) throws CaseErrorException;

		/**
		 * 浠庡彸杈圭Щ闄や竴涓璞★紝骞惰繑鍥炶瀵硅薄
		 * 
		 * @param listKey
		 * @return
		 */
		public <K> Object popFromListRight(K listKey);
		
		/**
		 * 浠庡彸杈圭Щ闄や竴涓璞★紝骞惰繑鍥炶瀵硅薄
		 * 
		 * @param listKey
		 * @return
		 */
		public <K,V> V popFromListRight(K listKey,Class<V> valueType)throws CaseErrorException;

		

		/**
		 * 鑾峰彇鍒楄〃闀垮害
		 * 
		 * @param listKey
		 * @return
		 */
		public <K> int getLengthOfList(K listKey);
		
		/**
		 * 鑾峰彇鍒楄〃闀垮害
		 * 
		 * @param listKey
		 * @return
		 */
		public int getLengthOfStringList(String listKey);

		
		
		/**
		 * 鑾峰彇map闀垮害
		 * 
		 * @param listKey
		 * @return
		 */
		public int getLengthOfStringMap(String mapKey) ;
		
		/**
		 * 鑾峰彇map闀垮害
		 * 
		 * @param listKey
		 * @return
		 */
		public <K> int getLengthOfMap(K mapKey) ;

		/**
		 * 鑾峰彇list鏌愪竴鑼冨洿鐨勬
		 * 
		 * @param listKey
		 * @param start
		 * @param size
		 * @return
		 */
		public List<Object> getStringListRange(String listKey, int start, int size) ;

		/**
		 * 鑾峰彇list鏌愪竴鑼冨洿鐨勬
		 * 
		 * @param listKey
		 * @param start
		 * @param size
		 * @return
		 */
		public <V> List<V> getStringListRange(String listKey,Class<V> valueType, int start, int size) throws CaseErrorException;
		
		/**
		 * 鑾峰彇list鏌愪竴鑼冨洿鐨勬
		 * 
		 * @param listKey
		 * @param start
		 * @param size
		 * @return
		 */
		public <K> List<Object> getListRange(K listKey, int start, int size) ;

		/**
		 * 鑾峰彇list鏌愪竴鑼冨洿鐨勬
		 * 
		 * @param listKey
		 * @param start
		 * @param size
		 * @return
		 */
		public <K,V> List<V> getListRange(K listKey,Class<V> valueType, int start, int size) throws CaseErrorException;
		
		/**
		 * 鑾峰彇Map缁撴瀯鎵�湁鏁版嵁
		 * 
		 * @param mapKey
		 * @return
		 */
		public <K> Map<Object, Object> getMapAll(K mapKey);
		
		/**
		 * 鑾峰彇Map缁撴瀯鎵�湁鏁版嵁
		 * 
		 * @param mapKey
		 * @return
		 */
		public <K,F,V> Map<F, V> getMapAll(K mapKey,F fieldType,V valueType)throws CaseErrorException;
		/**
		 * 鑾峰彇Map缁撴瀯鎵�湁鏁版嵁(key涓篠tring)
		 * 
		 * @param mapKey
		 * @return
		 */
		public Map<String, String> getStringMapAll(String mapKey) ;
		/**
		 * 娣诲姞鍒癕ap缁撴瀯
		 * 
		 * @param mapKey
		 * @param field
		 * @param value
		 */
		public <K,F,V> void putToMap(K mapKey, F field, V value) ;
		/**
		 * 娣诲姞鍒癕ap缁撴瀯(key涓篠tring)
		 * 
		 * @param mapKey
		 * @param field
		 * @param value
		 */
		public void putStringToMap(String mapKey, String field, String value) ;

		/**
		 * 鎵归噺璁剧疆鍒癶ash鏁版嵁缁撴灉锛岄噰鐢╞yte绫诲瀷瀛樺偍锛岃繑鍥�鎵归噺璁剧疆鎴愬姛鐨勮褰曟暟,澶辫触杩斿洖-1
		 * 鍙栫殑鏃跺�寰楁敞鎰忔暟鎹被鍨嬭浆鎹紙渚嬪锛歁ap<key,value
		 * >涓璸ut鏁版嵁鏃秌ey鐨勭被鍨嬩负String锛岄偅涔坓et鐨勬椂鍊欓渶涓ユ牸鐢⊿tring绫诲瀷,鍚﹀垯get鏃朵細寰椾笉鍒颁綘鎯宠鐨勶級
		 * 
		 * @param mapKey
		 * @param data
		 */
		public <K,F,V> int putToMap(K mapKey, Map<F, V> data) ;

		/**
		 * 娣诲姞鍒癕ap缁撴瀯锛坘ey涓篠tring锛夎繑鍥�鎵归噺璁剧疆鎴愬姛鐨勮褰曟暟,澶辫触杩斿洖-1
		 * 
		 * @param mapKey
		 * @param data
		 */
		public int putStringToMap(String mapKey, Map<String, String> data) ;

		/**
		 * 浠嶮ap缁撴瀯涓幏鍙栨暟鎹�		 * 
		 * @param mapKey
		 * @param field
		 * @return
		 */
		public String getStringFromMap(String mapKey, String field) ;

		/**
		 * 鍒ゆ柇Map缁撴瀯鏄惁瀛樺湪field
		 * 
		 * @param mapKey
		 * @param field
		 * @return
		 */
		public boolean hexistsString(String mapKey, String field) ;

		/**
		 * 鍒ゆ柇Map缁撴瀯鏄惁瀛樺湪field
		 * 
		 * @param mapKey
		 * @param field
		 * @return
		 */
		public <K,F> boolean hexists(K mapKey, F field);

		/**
		 * 浠嶮ap缁撴瀯涓幏鍙栨暟鎹�		 * 
		 * @param mapKey
		 * @param field
		 * @return
		 */
		public <K,F> Object getFromMap(K mapKey, F field) ;
		/**
		 * 浠嶮ap缁撴瀯涓幏鍙栨暟鎹�		 * 
		 * @param mapKey
		 * @param field
		 * @return
		 */
		public <K,F,V> V getFromMap(K mapKey, F field,Class<V> valueType) throws CaseErrorException;

		

		/**
		 * 浠巑ap涓Щ闄よ褰�		 * 
		 * @param mapKey
		 * @param field
		 */
		public <K,F> void removeFromMap(K mapKey, F field) ;

		
		/**
		 * 娣诲姞鍒皊orted set闃熷垪锛屽瓧绗︿覆绫诲瀷
		 * 
		 * @param setKey
		 * @param value
		 * @param score
		 */
		public void addToStringSortedSet(String setKey, String value, double score) ;

		/**
		 * 娣诲姞鍒皊orted set闃熷垪锛宩ava搴忓垪鍖栧璞＄被鍨�		 * 
		 * @param setKey
		 * @param value
		 * @param score
		 */
		public <K,V>void addToSortedSet(K setKey, V value, double score) ;
		/**
		 * 浠巗orted set涓幏鍙栦竴瀹氳寖鍥寸殑娈碉紝鎸塻core浠庝綆鍒伴珮
		 * 
		 * @param sortKey
		 * @param start
		 * @param size
		 * @return
		 */
		public Set<String> getStringSortedSetRange(String sortKey, int start, int size) ;
		

		/**
		 * 浠巗orted set涓幏鍙栦竴瀹氳寖鍥寸殑娈碉紝鎸塻core浠庨珮鍒颁綆
		 * 
		 * @param sortKey
		 * @param start
		 * @param size
		 * @return
		 */
		public Set<String> getStringSortedSetRangeReverse(String sortKey, int start,
				int size) ;
		
		/**
		 * 鏍规嵁score浠巗orted set涓Щ闄よ褰�		 * 
		 * @param keySet
		 * @param score
		 */
		public long removeFromSortedSetByScore(String keySet, double score) ;

		/**
		 * 杩斿洖鍖归厤鐨刱ey閿�keys AA*
		 * 
		 * @param pattern
		 * @return
		 */
		public Set<String> keys(String pattern) ;
}
